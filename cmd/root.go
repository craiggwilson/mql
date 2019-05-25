package cmd

import (
	"context"
	"fmt"
	"os"

	"github.com/spf13/cobra"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
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
