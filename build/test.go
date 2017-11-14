package build

import (
	"fmt"
	"io"
	"os"
	"os/exec"

	"github.com/craiggwilson/goke/task"
	"github.com/craiggwilson/goke/task/command"
	"github.com/pkg/errors"
)

func TestUnit(ctx *task.Context) error {
	if err := os.MkdirAll(reportsDir, os.ModePerm); err != nil {
		return errors.Wrapf(err, "failed to create directory %q", reportsDir)
	}

	args := []string{"test", fmt.Sprintf("-coverprofile=%s", unitTestCoverageFile), "-covermode=count"}
	if ctx.Verbose {
		args = append(args, "-v")
	}
	args = append(args, packages...)

	outFile, err := createFile(unitTestResultsFile)
	if err != nil {
		return err
	}
	defer func() {
		_ = outFile.Close()
	}()

	out := io.MultiWriter(ctx, outFile)

	cmd := exec.CommandContext(ctx, "go", args...)
	cmd.Stdout = out
	cmd.Stderr = out

	logCmd(ctx, cmd)
	err = cmd.Run()
	if err != nil {
		return err
	}

	err = command.Command("go", "tool", "cover", fmt.Sprintf("-func=%s", unitTestCoverageFile), "-o", unitTestCoverageReportFile)(ctx)
	if err != nil {
		return err
	}

	err = command.Command("go", "tool", "cover", fmt.Sprintf("-html=%s", unitTestCoverageFile), "-o", unitTestCoverageHTMLReportFile)(ctx)
	if err != nil {
		return err
	}

	return copyFile(unitTestResultsFile, unitTestReportFile)
}
