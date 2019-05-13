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
	translateCommand.Flags().StringP("format", "f", "shell", "Specify either \"shell\" or \"extjson\".")
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

		format, err := cmd.Flags().GetString("format")
		if err != nil {
			fmt.Println(err)
			os.Exit(1)
		}
		switch format {
		case "extjson":
			astprint.Print(os.Stdout, pipeline)
		case "shell":
			astprint.ShellPrint(os.Stdout, pipeline)
		default:
			fmt.Printf("only 'shell' and 'extjson' are supported for the format flag: got %q\n", format)
			os.Exit(2)
		}
	},
}
