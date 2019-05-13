package cmd

import (
	"context"
	"errors"
	"fmt"
	"os"
	"strings"

	astparser "github.com/10gen/mongoast/parser"
	"github.com/abiosoft/readline"
	"github.com/craiggwilson/mql/parser"
	"github.com/spf13/cobra"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
	"go.mongodb.org/mongo-driver/x/bsonx/bsoncore"
)

// Execute runs the binary with the specified args.
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
	Run: func(cmd *cobra.Command, args []string) {
		uri, err := cmd.Flags().GetString("uri")
		if err != nil {
			fmt.Println(err)
			os.Exit(1)
		}

		client, err := mongo.Connect(context.Background(), options.Client().ApplyURI(uri))
		if err != nil {
			fmt.Println(err)
			os.Exit(1)
		}

		i := interactor{client: client}

		i.run()
	},
}

type interactor struct {
	client *mongo.Client

	currentDB string
}

func (i *interactor) run() {
	rl, err := readline.NewEx(&readline.Config{
		Prompt:          ">>> ",
		InterruptPrompt: "^C",
		EOFPrompt:       "exit",

		HistorySearchFold:      true,
		DisableAutoSaveHistory: true,
	})
	if err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
	defer rl.Close()

	var current []string
	for {
		result := rl.Line()
		if result.CanContinue() {
			continue
		}
		if result.CanBreak() {
			break
		}

		line := strings.TrimSpace(result.Line)
		if len(line) == 0 {
			continue
		}

		switch {
		case len(current) == 0 && line == "exit":
			os.Exit(0)
		case len(current) == 0 && (line == "clear" || line == "cls"):
			readline.ClearScreen(nil)
		default:
			current = append(current, line)
			if !strings.HasSuffix(line, ";") {
				rl.SetPrompt("... ")
				continue
			}

			stmtString := strings.TrimSuffix(strings.Join(current, " "), ";")
			current = current[:0]
			rl.SetPrompt(">>> ")
			rl.SaveHistory(stmtString + ";")

			stmt, err := parser.ParseStatement(strings.NewReader(stmtString))
			if err != nil {
				fmt.Println(err)
				continue
			}

			err = i.executeStatement(stmt)
			if err != nil {
				fmt.Println(err)
				continue
			}
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
