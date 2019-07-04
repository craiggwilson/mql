package parser

import (
	"io"
	"io/ioutil"

	"github.com/craiggwilson/mql/internal/grammar"

	"github.com/10gen/mongoast/ast"
	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/pkg/errors"
)

// ParseStatement takes a read and parses it into a Statement.
func ParseStatement(r io.Reader) (Statement, error) {
	errs := &errorCollector{}
	p, err := setupParser(r, errs)
	if err != nil {
		return nil, err
	}

	tree := p.FullStatement()
	if err := errs.Error(); err != nil {
		return nil, errs.Error()
	}

	// parse complete, now build the tree
	return translateFullStatement(tree)
}

// ParsePipeline takes a reader and parses it into a mongoast.Pipeline.
func ParsePipeline(r io.Reader) (*ast.Pipeline, error) {
	errs := &errorCollector{}
	p, err := setupParser(r, errs)
	if err != nil {
		return nil, err
	}

	tree := p.FullPipeline()
	if err := errs.Error(); err != nil {
		return nil, errs.Error()
	}

	// parse complete, now build the tree
	return translateFullPipeline(tree)
}

// ParseExpr takes a reader and parses it into an ast.Expr.
func ParseExpr(r io.Reader) (ast.Expr, error) {
	errs := &errorCollector{}
	p, err := setupParser(r, errs)
	if err != nil {
		return nil, err
	}

	tree := p.Expression()
	if err := errs.Error(); err != nil {
		return nil, errs.Error()
	}

	// parse complete, now build the tree
	return translateExpr(tree)
}

type errorCollector struct {
	*antlr.DefaultErrorListener
	errs []error
}

func (ec *errorCollector) Error() error {
	if len(ec.errs) > 0 {
		return ec.errs[0]
	}

	return nil
}

func (ec *errorCollector) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{}, line, column int, msg string, e antlr.RecognitionException) {
	ec.errs = append(ec.errs, errors.Errorf("%s on line %d, character %d", msg, line, column))
}

func setupParser(r io.Reader, errorListener antlr.ErrorListener) (*grammar.MQLParser, error) {
	bytes, err := ioutil.ReadAll(r)
	if err != nil {
		return nil, err
	}

	input := antlr.NewInputStream(string(bytes))
	lexer := grammar.NewMQLLexer(input)
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(errorListener)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := grammar.NewMQLParser(tokens)
	p.Interpreter.SetPredictionMode(antlr.PredictionModeSLL)
	p.RemoveErrorListeners()
	p.AddErrorListener(errorListener)

	return p, nil
}
