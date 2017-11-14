package build

import (
	"bytes"
	"fmt"
	"os/exec"
	"strings"

	"github.com/craiggwilson/goke/task"
)

func currentGitBranch(ctx *task.Context) (string, error) {
	cmd := exec.CommandContext(ctx, "git", "rev-parse", "--abbrev-ref", "HEAD")
	ctx.Logf("exec: '%s %s'\n", cmd.Path, strings.Join(cmd.Args[1:], " "))
	output, err := cmd.CombinedOutput()
	return string(bytes.TrimSpace(output)), err
}

func currentGitSHA1(ctx *task.Context) (string, error) {
	cmd := exec.CommandContext(ctx, "git", "rev-parse", "HEAD")
	ctx.Logf("exec: '%s %s'\n", cmd.Path, strings.Join(cmd.Args[1:], " "))
	output, err := cmd.CombinedOutput()
	return string(bytes.TrimSpace(output)), err
}

func currentGitTagAndCommitsSince(ctx *task.Context) (string, string, error) {
	cmd := exec.CommandContext(ctx, "git", "describe", "--tags", "--abbrev=0")
	ctx.Logf("exec: '%s %s'\n", cmd.Path, strings.Join(cmd.Args[1:], " "))
	tagName, err := cmd.CombinedOutput()
	if err != nil {
		cmd := exec.CommandContext(ctx, "git", "rev-list", "HEAD", "--count")
		ctx.Logf("exec: '%s %s'\n", cmd.Path, strings.Join(cmd.Args[1:], " "))
		commitsSince, err := cmd.CombinedOutput()
		if err != nil {
			return "", "", err
		}

		commitsSince = bytes.TrimSpace(commitsSince)

		return "v0.0.0", string(commitsSince), nil
	}

	tagName = bytes.TrimSpace(tagName)

	cmd = exec.CommandContext(ctx, "git", "rev-list", fmt.Sprintf("%s..HEAD", string(tagName)), "--count")
	ctx.Logf("exec: '%s %s'\n", cmd.Path, strings.Join(cmd.Args[1:], " "))

	commitsSince, err := cmd.CombinedOutput()
	if err != nil {
		return "", "", err
	}

	commitsSince = bytes.TrimSpace(commitsSince)

	return string(tagName), string(commitsSince), nil
}
