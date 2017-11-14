package build

import (
	"fmt"
	"os"
	"os/exec"
	"path/filepath"
	"runtime"
	"strings"
	"time"

	"github.com/craiggwilson/goke/task"
	"github.com/pkg/errors"
)

func BuildMQLT(ctx *task.Context) error {
	build, err := getMQLTBuildConfig(runtime.GOOS, runtime.GOARCH)
	if err != nil {
		return err
	}

	return buildMQLT(ctx, build, "local-build", artifactsDir)
}

func buildMQLT(ctx *task.Context, build buildConfig, version string, outDir string) error {
	outPath := filepath.Join(outDir, build.BinaryName)
	_ = os.Remove(outPath)

	ldflags, err := getLdflags(ctx, version)
	if err != nil {
		return err
	}

	cmd := exec.CommandContext(ctx, "go", "build", "-ldflags", ldflags, "-o", outPath, mqlMainFile)

	parts := strings.SplitN(build.Platform, "_", 2)
	cmd.Env = append(os.Environ(),
		"GOOS="+parts[0],
		"GOARCH="+parts[1],
	)
	logCmd(ctx, cmd)
	if !ctx.DryRun {
		output, err := cmd.CombinedOutput()

		if len(output) > 0 {
			_, _ = ctx.Write(output)
		}

		if err != nil {
			return errors.New("failed to build mongohoused")
		}
	}
	return nil
}

func getLdflags(ctx *task.Context, version string) (string, error) {
	sha1, err := currentGitSHA1(ctx)
	if err != nil {
		return "", err
	}

	return fmt.Sprintf("-s -w -X github.com/10gen/mongohouse/internal/util/buildinfo.Version=%s -X github.com/10gen/mongohouse/internal/util/buildinfo.Commit=%s -X github.com/10gen/mongohouse/internal/util/buildinfo.Date=%s", version, sha1, time.Now().Format(time.RFC3339)), nil
}

func getMQLTBuildConfig(os, arch string) (buildConfig, error) {
	platform := strings.Join([]string{os, arch}, "_")
	for _, build := range mqlBuilds {
		if build.Platform == platform {
			return build, nil
		}
	}

	return buildConfig{}, fmt.Errorf("no mqlt build defined for %s", platform)
}

func getVersion(ctx *task.Context) (string, error) {
	currentTag, commitsSince, err := currentGitTagAndCommitsSince(ctx)
	if err != nil {
		return "", err
	}

	version := currentTag
	// if commitsSince is 0, it means that this commit was tagged with something specific in which
	// case we'll just use it directly. Otherwise, we are going to add -next to it along with the
	// number of commits since the last tag.
	if commitsSince != "0" {
		version = fmt.Sprintf("%s-next.%s", version, commitsSince)
	}

	return version, nil
}
