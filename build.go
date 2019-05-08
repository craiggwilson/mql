package main

import (
	"flag"
	"fmt"
	"os"

	"github.com/craiggwilson/mql/build"
	"github.com/craiggwilson/goke/task"
)

var registry = task.NewRegistry()

func init() {
	registry.Declare("clean").Description("cleans up artifacts").Do(build.Clean)
	registry.Declare("fmt").Description("formats all go files with gofmt").Do(build.Fmt)

	// Build
	registry.Declare("build").Description("compile all the binaries").DependsOn("build-mqlt")
	registry.Declare("build-mqlt").Description("compiles the mql translator").Do(build.BuildMQLT)

	// Generate
	registry.Declare("generate").Description("runs all the generation tasks").DependsOn("generate-grammar")
	registry.Declare("generate-grammar").Description("generates the grammar").Do(build.GenerateGrammar)

	// Static-Analysis
	registry.Declare("sa").Description("runs static analysis").DependsOn("sa-fmt", "sa-lint")
	registry.Declare("sa-fmt").Description("check that all the files are properly formatted").Do(build.SAFmt)
	registry.Declare("sa-lint").Description("runs the linter").Do(build.SALint)

	// Test
	registry.Declare("test").Description("runs all tests").Do(build.TestUnit)

	// Verify
	registry.Declare("verify").Description("verifies all the code").DependsOn("sa", "test")
}

func main() {
	err := task.Run(registry, os.Args[1:])
	if err != nil {
		if err == flag.ErrHelp {
			os.Exit(1)
		}
		fmt.Println(err)
		os.Exit(2)
	}
}
