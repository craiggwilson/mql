package cmd

import (
	"context"
	"errors"
	"fmt"
	"os"
	"strings"

	astparser "github.com/10gen/mongoast/parser"
	prompt "github.com/c-bata/go-prompt"
	"github.com/craiggwilson/mql/parser"
	"github.com/spf13/cobra"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
	"go.mongodb.org/mongo-driver/x/bsonx/bsoncore"
)

func Execute(args []string) {
	if err := rootCmd.Execute(); err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
}

func init() {
	rootCmd.Flags().StringP("uri", "", "mongodb://localhost:27017", "The MongoDB URI to use to connect in interactive mode.")
}

var rootCmd = &cobra.Command{
	Use:   "mql",
	Short: "MQL is a tool for an expirimental language on top of MongoDB's aggregation framework.",
	Args:  cobra.MaximumNArgs(0),
	RunE: func(cmd *cobra.Command, args []string) error {
		uri, err := cmd.Flags().GetString("uri")
		if err != nil {
			return err
		}

		client, err := mongo.Connect(context.Background(), options.Client().ApplyURI(uri))
		if err != nil {
			return err
		}

		i := interactor{client: client}

		for {
			i.parseInput()
			fmt.Println()
		}

		return nil
	},
}

type interactor struct {
	client *mongo.Client

	currentDB string
}

func (i *interactor) parseInput() {
	line := prompt.Input("> ", i.completer)
	switch line {
	case "exit":
		os.Exit(0)
	default:
		stmt, err := parser.ParseStatement(strings.NewReader(line))
		if err != nil {
			fmt.Println(err)
			return
		}

		err = i.executeStatement(stmt)
		if err != nil {
			fmt.Println(err)
			return
		}
	}
}

func (i *interactor) executeStatement(stmt parser.Statement) error {
	switch typedStmt := stmt.(type) {
	case *parser.QueryStatement:
		return i.executeQueryStatement(typedStmt)
	case *parser.UseDatabaseStatement:
		return i.executeUseDatabaseStatement(typedStmt)
	default:
		return errors.New("unknown statement type")
	}
}

func (i *interactor) executeQueryStatement(stmt *parser.QueryStatement) error {
	ctx := context.Background()
	if stmt.DatabaseName == "" {
		stmt.DatabaseName = i.currentDB
	}
	db := i.client.Database(stmt.DatabaseName)
	coll := db.Collection(stmt.CollectionName)

	pipeline := astparser.DeparsePipeline(stmt.Pipeline)
	elements, _ := pipeline.Array().Elements()
	stages := make([]bsoncore.Document, len(elements))
	for i, element := range elements {
		stages[i] = element.Value().Document()
	}

	cursor, err := coll.Aggregate(ctx, stages)
	if err != nil {
		return err
	}
	defer cursor.Close(ctx)

	for cursor.Next(ctx) {
		fmt.Println(cursor.Current)
	}

	return cursor.Err()
}

func (i *interactor) executeUseDatabaseStatement(stmt *parser.UseDatabaseStatement) error {
	i.currentDB = stmt.DatabaseName
	return nil
}

func (i *interactor) completer(in prompt.Document) []prompt.Suggest {
	return []prompt.Suggest{}
}
