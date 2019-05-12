package cmd

import (
	"errors"
	"os"
	"strings"

	"github.com/craiggwilson/mql/parser"

	"github.com/10gen/mongoast/astprint"
	"github.com/spf13/cobra"
)

func init() {
	rootCmd.AddCommand(translateCommand)
	translateCommand.Flags().StringP("format", "f", "shell", "Specify either 'shell' or 'extjson'. The default is 'shell'.")
}

var translateCommand = &cobra.Command{
	Use:   "translate",
	Short: "Translate an MQL query into the aggregation framework.",
	Args:  cobra.ExactArgs(1),
	RunE: func(cmd *cobra.Command, args []string) error {
		pipeline, err := parser.ParsePipeline(strings.NewReader(args[0]))
		if err != nil {
			return err
		}

		format, err := cmd.Flags().GetString("format")
		if err != nil {
			return err
		}
		switch format {
		case "extjson":
			astprint.Print(os.Stdout, pipeline)
		case "shell":
			astprint.ShellPrint(os.Stdout, pipeline)
		}

		return errors.New("only 'shell' and 'extjson' are supported for the format flag")
	},
}
