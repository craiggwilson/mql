package build

import (
	"os"

	"github.com/craiggwilson/goke/task"
	"github.com/craiggwilson/goke/task/command"
)

func Clean(ctx *task.Context) error {
	if err := os.RemoveAll(artifactsDir); err != nil && !os.IsNotExist(err) {
		ctx.Logf("failed removing artifacts directory %s: %v", artifactsDir, err)
	}
	return nil
}

func Fmt(ctx *task.Context) error {
	args := []string{"-s", "-l", "-w"}
	if ctx.Verbose {
		args = append(args, "-e")
	}
	args = append(args, packages...)

	return command.Command("gofmt", args...)(ctx)
}
