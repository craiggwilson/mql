package cmd

import (
	"fmt"
	"os"

	"github.com/spf13/cobra"
)

func Execute(args []string) {
	if err := rootCmd.Execute(); err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
}

var rootCmd = &cobra.Command{
	Use:   "mql",
	Short: "MQL is a tool for an expirimental language on top of MongoDB's aggregation framework.",
}
