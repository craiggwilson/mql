package main

import (
	"os"

	"bitbucket.org/craiggwilson/mql/cmd"
)

func main() {
	cmd.Execute(os.Args[1:])
}
