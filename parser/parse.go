package parser

import (
	"io"
	"io/ioutil"

	"github.com/craiggwilson/mql/internal/grammar"

	"github.com/10gen/mongoast/ast"
	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/pkg/errors"
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
func ParseStatement(r io.Reader) (stmt *QueryStatement, err error) {
	var p *grammar.MQLParser
	var errs *errorCollector
	p, errs, err = setupParser(r)
	if err != nil {
		return
	}

	defer func() {
		if e := recover(); e != nil {
			var ok bool
			err, ok = e.(error)
			if !ok {
				err = errors.Errorf("%v", e)
			}
			if len(errs.errs) > 0 {
				err = errs.errs[0]
			}
		}
	}()

	stmt, err = translateQueryStatement(p.QueryStatement())
	return
}

// ParsePipeline takes a reader and parses it into a mongoast.Pipeline.
func ParsePipeline(r io.Reader) (pipeline *ast.Pipeline, err error) {
	var p *grammar.MQLParser
	var errs *errorCollector
	p, errs, err = setupParser(r)
	if err != nil {
		return
	}

	defer func() {
		if e := recover(); e != nil {
			var ok bool
			err, ok = e.(error)
			if !ok {
				err = errors.Errorf("%v", e)
			}
			if len(errs.errs) > 0 {
				err = errs.errs[0]
			}
		}
	}()

	pipeline, err = translatePipeline(p.Pipeline())
	return
}

// ParseExpr takes a reader and parses it into an ast.Expr.
func ParseExpr(r io.Reader) (expr ast.Expr, err error) {
	var p *grammar.MQLParser
	var errs *errorCollector
	p, errs, err = setupParser(r)
	if err != nil {
		return
	}

	defer func() {
		if e := recover(); e != nil {
			var ok bool
			err, ok = e.(error)
			if !ok {
				err = errors.Errorf("%v", e)
			}
			if len(errs.errs) > 0 {
				err = errs.errs[0]
			}
		}
	}()

	expr, err = translateExpr(p.Expression())
	return
}

type errorCollector struct {
	*antlr.DefaultErrorListener
	errs []error
}

func (l *errorCollector) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{}, line, column int, msg string, e antlr.RecognitionException) {
	l.errs = append(l.errs, errors.Errorf("%s on line %d, character %d", msg, line, column))
}

func setupParser(r io.Reader) (*grammar.MQLParser, *errorCollector, error) {
	bytes, err := ioutil.ReadAll(r)
	if err != nil {
		return nil, nil, err
	}

	input := antlr.NewInputStream(string(bytes))
	lexer := grammar.NewMQLLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, 0)
	p := grammar.NewMQLParser(tokens)
	p.Interpreter.SetPredictionMode(antlr.PredictionModeSLL)
	p.RemoveErrorListeners()
	errs := &errorCollector{}
	p.AddErrorListener(errs)

	return p, errs, nil
}
