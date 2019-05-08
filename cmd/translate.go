package cmd

import (
	"fmt"
	"os"
	"strings"

	"github.com/craiggwilson/mql/parser"

	"github.com/10gen/mongoast/astprint"
	"github.com/spf13/cobra"
)

func init() {
	rootCmd.AddCommand(translateCommand)
}

var translateCommand = &cobra.Command{
	Use:   "translate",
	Short: "Translate an MQL query into the aggregation framework.",
	Args:  cobra.ExactArgs(1),
	Run: func(cmd *cobra.Command, args []string) {
		pipeline, err := parser.ParsePipeline(strings.NewReader(args[0]))
		if err != nil {
			fmt.Println(err)
			os.Exit(1)
		}

		astprint.Print(os.Stdout, pipeline)
	},
}
