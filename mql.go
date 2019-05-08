package main

import (
	"os"

	"github.com/craiggwilson/mql/cmd"
)

func main() {
	cmd.Execute(os.Args[1:])
}
