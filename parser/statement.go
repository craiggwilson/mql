package parser

import (
	"github.com/10gen/mongoast/ast"
)

// Statement is a statement.
type Statement interface {
	stmt()
}

func (*QueryStatement) stmt() {}
func (*UseDatabaseStatement) stmt() {}

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

// NewUseDatabaseStatement makes a UseDatabaseStatement.
func NewUseDatabaseStatement(databaseName string) *UseDatabaseStatement {
	return &UseDatabaseStatement{DatabaseName: databaseName}
}

// UseDatabaseStatement is a use database statement.
type UseDatabaseStatement struct {
	DatabaseName string
}