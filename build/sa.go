package build

import (
	"errors"
	"os/exec"

	"github.com/craiggwilson/goke/task"
	"github.com/craiggwilson/goke/task/command"
)

func SAFmt(ctx *task.Context) error {
	args := []string{"-s", "-l"}
	if ctx.Verbose {
		args = append(args, "-e")
	}
	args = append(args, packages...)

	cmd := exec.CommandContext(ctx, "gofmt", args...)

	logCmd(ctx, cmd)
	if !ctx.DryRun {
		output, err := cmd.CombinedOutput()
		if err != nil {
			return err
		}

		if len(output) > 0 {
			_, _ = ctx.Write(output)
			return errors.New("some files are not formatted according to gofmt")
		}
	}

	return nil
}

func SALint(ctx *task.Context) error {
	err := command.Command("golangci-lint", "--version")(ctx)
	if err != nil {
		return err
	}

	args := []string{"run", "--deadline", "10m"}
	args = append(args, packages...)
	return command.Command("golangci-lint", args...)(ctx)
}
