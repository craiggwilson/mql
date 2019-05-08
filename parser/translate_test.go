package parser_test

import (
	"strings"
	"testing"

	"github.com/craiggwilson/mql/parser"
	"github.com/craiggwilson/mql/internal/util/bsonutil"

	"github.com/10gen/mongoast/ast"
	"github.com/google/go-cmp/cmp"
)

func TestParseExpr(t *testing.T) {
	testCases := []struct{
		input string
		expected ast.Expr
		err error
	} {
		// Constants
		{ 
			"false",
			ast.NewConstant(bsonutil.False),
			nil,
		},
		{ 
			"true",
			ast.NewConstant(bsonutil.True),
			nil,
		},
		{
			"1",
			ast.NewConstant(bsonutil.Int32(1)),
			nil,
		},
		{
			"-1",
			ast.NewConstant(bsonutil.Int32(-1)),
			nil,
		},
		{
			"1L",
			ast.NewConstant(bsonutil.Int64(1)),
			nil,
		},
		{
			"-1L",
			ast.NewConstant(bsonutil.Int64(-1)),
			nil,
		},
		{
			"1000000000000000000",
			ast.NewConstant(bsonutil.Int64(1000000000000000000)),
			nil,
		},
		{
			"-1000000000000000000",
			ast.NewConstant(bsonutil.Int64(-1000000000000000000)),
			nil,
		},
		{
			"1.234E12",
			ast.NewConstant(bsonutil.Double(1.234e12)),
			nil,
		},
		{
			"-1.234E12",
			ast.NewConstant(bsonutil.Double(-1.234e12)),
			nil,
		},
		{
			"1M",
			ast.NewConstant(bsonutil.Decimal128FromString("1")),
			nil,
		},
		{
			"-1M",
			ast.NewConstant(bsonutil.Decimal128FromString("-1")),
			nil,
		},
		{
			"1.234E12m",
			ast.NewConstant(bsonutil.Decimal128FromString("1.234E12")),
			nil,
		},
		{
			"-1.234E12m",
			ast.NewConstant(bsonutil.Decimal128FromString("-1.234E12")),
			nil,
		},
		{
			"0b1001",
			ast.NewConstant(bsonutil.Int32(9)),
			nil,
		},
		{
			"0b1001L",
			ast.NewConstant(bsonutil.Int64(9)),
			nil,
		},
		{
			"0o644",
			ast.NewConstant(bsonutil.Int32(420)),
			nil,
		},
		{
			"0o644L",
			ast.NewConstant(bsonutil.Int64(420)),
			nil,
		},
		{
			"0xF0L",
			ast.NewConstant(bsonutil.Int64(240)),
			nil,
		},
		{
			"0xF0",
			ast.NewConstant(bsonutil.Int32(240)),
			nil,
		},
		{
			"0xF0L",
			ast.NewConstant(bsonutil.Int64(240)),
			nil,
		},
		{
			"\"testing\"",
			ast.NewConstant(bsonutil.String("testing")),
			nil,
		},
		{
			"'testing'",
			ast.NewConstant(bsonutil.String("testing")),
			nil,
		},
		{
			"null",
			ast.NewConstant(bsonutil.Null()),
			nil,
		},	
		{
			"/foo/i",
			ast.NewConstant(bsonutil.Regex("foo", "i")),
			nil,
		},	
		{
			"/fo\\/o/i",
			ast.NewConstant(bsonutil.Regex("fo/o", "i")),
			nil,
		},	
		{
			"oid'507f1f77bcf86cd799439011'",
			ast.NewConstant(bsonutil.ObjectIDFromHex("507f1f77bcf86cd799439011")),
			nil,
		},
		{
			"dt'2000-01-01T12:00:00Z'",
			ast.NewConstant(bsonutil.DateTime(946728000000)),
			nil,
		},
		{
			"dt'2000-01-01T12:00:00+00:00'",
			ast.NewConstant(bsonutil.DateTime(946728000000)),
			nil,
		},

		// Document
		{
			"{a: true}",
			ast.NewDocument(
				ast.NewDocumentElement("a", ast.NewConstant(bsonutil.True)),
			),
			nil,
		},

		// Arrays
		{
			"[true, false, true]",
			ast.NewArray(
				ast.NewConstant(bsonutil.True),
				ast.NewConstant(bsonutil.False),
				ast.NewConstant(bsonutil.True),
			),
			nil,
		},

		// References
		{
			"a",
			ast.NewFieldRef("a", nil),
			nil,
		},
		{
			"a.b",
			ast.NewFieldRef("b", ast.NewFieldRef("a", nil)),
			nil,
		},
		{
			"a[0].b",
			ast.NewFieldRef(
				"b", 
				ast.NewArrayIndexRef(
					ast.NewConstant(bsonutil.Int32(0)),
					ast.NewFieldRef("a", nil),
				),
			),
			nil,
		},
		{
			"{a: false}.a",
			ast.NewFieldRef(
				"a", 
				ast.NewDocument(
					ast.NewDocumentElement(
						"a",
						ast.NewConstant(bsonutil.False),
					),
				),
			),
			nil,
		},
	}

	for _, tc := range testCases {
		t.Run(tc.input, func(t *testing.T) {
			actual, err := parser.ParseExpr(strings.NewReader(tc.input))
			switch {
			case tc.err != nil && err != nil:
				if tc.err.Error() != err.Error()  {
					t.Fatalf("expected error %q, but got %q", tc.err.Error(), err.Error())
				}	
			case tc.err != nil && err == nil:
				t.Fatalf("expected error %q, but got none", tc.err.Error())
			case tc.err == nil && err != nil:
				t.Fatalf("expected no error, but got %q", err.Error())
	
			default:
				if !cmp.Equal(tc.expected, actual) {
					t.Fatalf("expected does not match actual\n  %s", cmp.Diff(tc.expected, actual))
				}
			}
		})
	}
}