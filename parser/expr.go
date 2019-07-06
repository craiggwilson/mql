package parser

import "github.com/10gen/mongoast/ast"

func visitNode(v ast.Visitor, n ast.Node) (ast.Node, bool) {
	newNode := v.Visit(n)
	return newNode, newNode != n
}

func visitExpr(v ast.Visitor, e ast.Expr) (ast.Expr, bool) {
	newNode, changed := visitNode(v, e)
	return newNode.(ast.Expr), changed
}

func newLambda(names []string, body ast.Expr) *lambda {
	return &lambda{
		Names: names,
		Body:  body,
	}
}

type lambda struct {
	Names []string
	Body  ast.Expr
}

// DeepCopy implements the DeepCopier interface.
func (n *lambda) DeepCopy() ast.DeepCopier {
	var newBody ast.Expr

	if n.Body != nil {
		newBody = n.Body.DeepCopy().(ast.Expr)
	}

	return newLambda(n.Names, newBody)
}

// Walk implements the Node interface.
func (n *lambda) Walk(v ast.Visitor) ast.Node {
	return n.WalkExpr(v)
}

// WalkExpr implements Expr interface.
func (n *lambda) WalkExpr(v ast.Visitor) ast.Expr {
	body, changed := visitExpr(v, n.Body)
	if changed {
		cpy := *n
		cpy.Body = body
		return &cpy
	}
	return n
}
