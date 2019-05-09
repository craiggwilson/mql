package parser

import (
	"io"
	"io/ioutil"

	"github.com/craiggwilson/mql/internal/grammar"

	"github.com/10gen/mongoast/ast"
	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// NewQueryStatement makes a QueryStatement.
func NewQueryStatement(databaseName, collectionName string, pipeline *ast.Pipeline) *QueryStatement {
	return &QueryStatement{
		DatabaseName:   databaseName,
		CollectionName: collectionName,
		Pipeline:       pipeline,
	}
}

// QueryStatement is a query statement.
type QueryStatement struct {
	DatabaseName   string
	CollectionName string
	Pipeline       *ast.Pipeline
}

// ParseStatement takes a read and parses it into a QueryStatement.
func ParseStatement(r io.Reader) (*QueryStatement, error) {
	bytes, err := ioutil.ReadAll(r)
	if err != nil {
		return nil, err
	}

	input := antlr.NewInputStream(string(bytes))
	lexer := grammar.NewMQLLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, 0)
	p := grammar.NewMQLParser(tokens)

	return translateQueryStatement(p.QueryStatement())
}

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

	return translatePipeline(p.Pipeline())
}

func ParseExpr(r io.Reader) (ast.Expr, error) {
	bytes, err := ioutil.ReadAll(r)
	if err != nil {
		return nil, err
	}

	input := antlr.NewInputStream(string(bytes))
	lexer := grammar.NewMQLLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, 0)
	p := grammar.NewMQLParser(tokens)

	return translateExpr(p.Expression())
}
