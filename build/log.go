package build

import (
	"os/exec"
	"strings"

	"github.com/craiggwilson/goke/task"
)

func logCmd(ctx *task.Context, cmd *exec.Cmd) {
	args := make([]string, len(cmd.Args)-1)
	for i := 1; i < len(cmd.Args); i++ {
		args[i-1] = cmd.Args[i]
		if strings.Contains(args[i-1], " ") {
			args[i-1] = "\"" + args[i-1] + "\""
		}
	}

	ctx.Logf("exec: '%s %s'\n", cmd.Path, strings.Join(args, " "))
}
