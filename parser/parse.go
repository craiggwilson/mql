package parser

import (
	"io"
	"io/ioutil"

	"bitbucket.org/craiggwilson/mql/internal/grammar"

	"github.com/10gen/mongoast/ast"
	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// ParsePipeline takes a reader and parses it into a mongoast.Pipeline.
func ParsePipeline(r io.Reader) (*ast.Pipeline, error) {
	bytes, err := ioutil.ReadAll(r)
	if err != nil {
		return nil, err
	}

	input := antlr.NewInputStream(string(bytes))
	lexer := grammar.NewMQLLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, 0)
	p := grammar.NewMQLParser(tokens)

	stages, err := translateQueryStatement(p.QueryStatement())
	if err != nil {
		return nil, err
	}

	return ast.NewPipeline(stages...), nil
}
