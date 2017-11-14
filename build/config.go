package build

import (
	"fmt"
	"os"
	"path/filepath"
)

var antlrToolDownloadURL = fmt.Sprintf("https://www.antlr.org/download/%s", antlrToolFileName)
var antlrToolFileName = fmt.Sprintf("antlr-%s-complete.jar", antlrToolVersion)
var antlrToolFile = filepath.Join(toolsDir, antlrToolFileName)
var antlrToolVersion = "4.7.1"

var artifactsDir = "./artifacts"

type buildConfig struct {
	BinaryName    string
	Platform      string
	ArchiveFormat string
}

var grammarFile = filepath.ToSlash("./internal/grammar/MQL.g4")

var mqlBuilds = []buildConfig{
	{
		BinaryName:    "mql",
		Platform:      "linux_amd64",
		ArchiveFormat: ".tar.gz",
	},
	{
		BinaryName:    "mql",
		Platform:      "darwin_amd64",
		ArchiveFormat: ".tar.gz",
	},
	{
		BinaryName:    "mql.exe",
		Platform:      "windows_amd64",
		ArchiveFormat: ".zip",
	},
}
var mqlMainFile = filepath.ToSlash("./mql.go")

var packages = func() []string {
	var packages []string
	collector := func(path string, fi os.FileInfo, err error) error {
		if err != nil {
			return err
		}

		if fi.IsDir() {
			// go files
			goFiles, err := filepath.Glob(filepath.Join(path, "*.go"))
			if err != nil {
				panic(fmt.Sprintf("failed getting go files: %v", err))
			}

			if len(goFiles) > 0 {
				packages = append(packages, filepath.ToSlash("./"+path))
			}
		}

		return nil
	}

	filepath.Walk("cmd", collector)
	filepath.Walk("internal", collector)
	filepath.Walk("parser", collector)

	return packages
}()

var reportsDir = filepath.Join(artifactsDir, "reports")
var testResultsDir = filepath.Join(artifactsDir, "tests")
var toolsDir = filepath.Join(artifactsDir, "tools")
var unitTestCoverageFile = filepath.Join(testResultsDir, "unit-coverage.out")
var unitTestCoverageHTMLReportFile = filepath.Join(reportsDir, "unit-tests-coverage-report.html")
var unitTestCoverageReportFile = filepath.Join(reportsDir, "unit-tests-coverage-report.txt")
var unitTestReportFile = filepath.Join(reportsDir, "unit-test-report.txt")
var unitTestResultsFile = filepath.Join(testResultsDir, "unit-results.out")
