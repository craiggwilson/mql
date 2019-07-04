package cmd

import (
	"context"
	"fmt"
	"os"
	"strings"

	"github.com/craiggwilson/mql/parser"

	"github.com/10gen/mongoast/astprint"
	"github.com/10gen/mongoast/optimizer"
	"github.com/spf13/cobra"
)

func init() {
	rootCmd.AddCommand(translateCommand)
	translateCommand.Flags().StringP("format", "f", "shell", "Specify either \"shell\" or \"extjson\".")
	translateCommand.Flags().BoolP("optimize", "o", false, "Whether to optimize the pipeline")
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

		optimize, err := cmd.Flags().GetBool("optimize")
		if err != nil {
			fmt.Println(err)
			os.Exit(1)
		}

		if optimize {
			pipeline = optimizer.Optimize(context.Background(), pipeline)
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
