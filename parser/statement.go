package parser

import (
	"github.com/10gen/mongoast/ast"
)

// Statement is a statement.
type Statement interface {
	stmt()
}

func (*QueryStatement) stmt() {}
func (*ShowCollectionsStatement) stmt() {}
func (*ShowDatabasesStatement) stmt() {}
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

// NewShowCollectionsStatement makes a ShowCollectionsStatement.
func NewShowCollectionsStatement(databaseName string, filter ast.Expr) *ShowCollectionsStatement {
	return &ShowCollectionsStatement{
		DatabaseName: databaseName,
		Filter: filter,
	}
}

// ShowCollectionsStatement is a show collections statement.
type ShowCollectionsStatement struct {
	DatabaseName string
	Filter ast.Expr
}

// NewShowDatabasesStatement makes a ShowDatabasesStatement.
func NewShowDatabasesStatement(filter ast.Expr) *ShowDatabasesStatement {
	return &ShowDatabasesStatement{
		Filter: filter,
	}
}

// ShowDatabasesStatement is a show databases statement.
type ShowDatabasesStatement struct {
	Filter ast.Expr
}

// NewUseDatabaseStatement makes a UseDatabaseStatement.
func NewUseDatabaseStatement(databaseName string) *UseDatabaseStatement {
	return &UseDatabaseStatement{DatabaseName: databaseName}
}

// UseDatabaseStatement is a use database statement.
type UseDatabaseStatement struct {
	DatabaseName string
}