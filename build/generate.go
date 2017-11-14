package build

import (
	"io"
	"net/http"
	"os"
	"path/filepath"

	"github.com/craiggwilson/goke/task"
	"github.com/craiggwilson/goke/task/command"
)

func downloadAntlr(ctx *task.Context) error {
	if _, err := os.Stat(antlrToolFile); err == nil {
		return nil
	}

	f, err := createFile(antlrToolFile)
	if err != nil {
		return err
	}
	defer f.Close()

	ctx.Logf("downloading antlr tool from %s\n", antlrToolDownloadURL)
	resp, err := http.Get(antlrToolDownloadURL)
	if err != nil {
		return err
	}
	defer resp.Body.Close()

	_, err = io.Copy(f, resp.Body)
	return err
}

func GenerateGrammar(ctx *task.Context) error {
	err := downloadAntlr(ctx)
	if err != nil {
		return err
	}

	args := []string{"-jar", antlrToolFile, "-Dlanguage=Go", "-no-listener", "-visitor", "-package", "grammar", "-o", filepath.Join("internal/grammar"), grammarFile}
	return command.Command("java", args...)(ctx)
}
