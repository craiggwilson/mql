package parser_test

import (
	"strings"
	"testing"
	"time"

	"github.com/craiggwilson/mql/parser"
	"github.com/craiggwilson/mql/internal/util/astutil"

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
			astutil.False,
			nil,
		},
		{ 
			"true",
			astutil.True,
			nil,
		},
		{
			"1",
			astutil.Int32(1),
			nil,
		},
		{
			"-1",
			astutil.Int32(-1),
			nil,
		},
		{
			"1L",
			astutil.Int64(1),
			nil,
		},
		{
			"-1L",
			astutil.Int64(-1),
			nil,
		},
		{
			"1000000000000000000",
			astutil.Int64(1000000000000000000),
			nil,
		},
		{
			"-1000000000000000000",
			astutil.Int64(-1000000000000000000),
			nil,
		},
		{
			"1.234E12",
			astutil.Double(1.234e12),
			nil,
		},
		{
			"-1.234E12",
			astutil.Double(-1.234e12),
			nil,
		},
		{
			"1M",
			astutil.Must(astutil.ParseDecimal128("1")),
			nil,
		},
		{
			"-1M",
			astutil.Must(astutil.ParseDecimal128("-1")),
			nil,
		},
		{
			"1.234E12m",
			astutil.Must(astutil.ParseDecimal128("1.234E12")),
			nil,
		},
		{
			"-1.234E12m",
			astutil.Must(astutil.ParseDecimal128("-1.234E12")),
			nil,
		},
		{
			"0b1001",
			astutil.Int32(9),
			nil,
		},
		{
			"0b1001L",
			astutil.Int64(9),
			nil,
		},
		{
			"0o644",
			astutil.Int32(420),
			nil,
		},
		{
			"0o644L",
			astutil.Int64(420),
			nil,
		},
		{
			"0xF0L",
			astutil.Int64(240),
			nil,
		},
		{
			"0xF0",
			astutil.Int32(240),
			nil,
		},
		{
			"0xF0L",
			astutil.Int64(240),
			nil,
		},
		{
			"\"testing\"",
			astutil.String("testing"),
			nil,
		},
		{
			"'testing'",
			astutil.String("testing"),
			nil,
		},
		{
			"null",
			astutil.Null,
			nil,
		},	
		{
			"/foo/i",
			astutil.Regex("foo", "i"),
			nil,
		},	
		{
			"/fo\\/o/i",
			astutil.Regex("fo/o", "i"),
			nil,
		},	
		{
			"oid'507f1f77bcf86cd799439011'",
			astutil.Must(astutil.ParseObjectID("507f1f77bcf86cd799439011")),
			nil,
		},
		{
			"dt'2000-01-01T12:00:00Z'",
			astutil.DateTime(time.Date(2000, 1, 1, 12, 0, 0, 0, time.UTC)),
			nil,
		},
		{
			"dt'2000-01-01T12:00:00+00:00'",
			astutil.DateTime(time.Date(2000, 1, 1, 12, 0, 0, 0, time.UTC)),
			nil,
		},

		// Document
		{
			"{a: true}",
			ast.NewDocument(
				ast.NewDocumentElement("a", astutil.True),
			),
			nil,
		},

		// Arrays
		{
			"[true, false, true]",
			ast.NewArray(
				astutil.True,
				astutil.False,
				astutil.True,
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
					astutil.Int32(0),
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
						astutil.False,
					),
				),
			),
			nil,
		},

		// Binary
		{
			"1 + 2",
			ast.NewFunction(
				"$add",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},
		{
			"1 and 2",
			ast.NewBinary(
				ast.And,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 || 2",
			ast.NewFunction(
				"$concat",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},
		{
			"1 / 2",
			ast.NewFunction(
				"$divide",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},
		{
			"1 = 2",
			ast.NewBinary(
				ast.Equals,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 > 2",
			ast.NewBinary(
				ast.GreaterThan,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 >= 2",
			ast.NewBinary(
				ast.GreaterThanOrEquals,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 ?? 2",
			ast.NewFunction(
				"$ifNull",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},
		{
			"1 ?? 2 ?? 3",
			ast.NewFunction(
				"$ifNull",
				ast.NewArray(
					ast.NewFunction(
						"$ifNull",
						ast.NewArray(
							astutil.Int32(1),
							astutil.Int32(2),
						),
					),
					astutil.Int32(3),
				),
			),
			nil,
		},
		{
			"1 in [2, 3]",
			ast.NewFunction(
				"$in",
				ast.NewArray(
					astutil.Int32(1), 
					ast.NewArray(astutil.Int32(2),astutil.Int32(3)),
				),
			),
			nil,
		},
		{
			"1 not in [2, 3]",
			ast.NewFunction(
				"$not",
				ast.NewFunction(
					"$in",
					ast.NewArray(
						astutil.Int32(1), 
						ast.NewArray(astutil.Int32(2),astutil.Int32(3)),
					),
				),
			),
			nil,
		},
		{
			"1 < 2",
			ast.NewBinary(
				ast.LessThan,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 <= 2",
			ast.NewBinary(
				ast.LessThanOrEquals,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 like /foo.*/i",
			ast.NewBinary(
				ast.Equals,
				astutil.Int32(1),
				astutil.Regex("foo.*", "i"),
			),
			nil,
		},
		{
			"1 % 2",
			ast.NewFunction(
				"$mod",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},
		{
			"1 * 2",
			ast.NewFunction(
				"$multiply",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},
		{
			"1 != 2",
			ast.NewBinary(
				ast.NotEquals,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 or 2",
			ast.NewBinary(
				ast.Or,
				astutil.Int32(1),
				astutil.Int32(2),
			),
			nil,
		},
		{
			"1 ** 2",
			ast.NewFunction(
				"$pow",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},
		{
			"1 - 2",
			ast.NewFunction(
				"$subtract",
				ast.NewArray(astutil.Int32(1),astutil.Int32(2)),
			),
			nil,
		},

		// Conditional
		{
			"if 1 then 2 else 3",
			ast.NewFunction(
				"$cond",
				ast.NewArray(
					astutil.Int32(1), 
					astutil.Int32(2),
					astutil.Int32(3),
				),
			),
			nil,
		},
		{
			"switch case 1 then 2 case 3 then 4 else 5",
			ast.NewFunction(
				"$switch",
				ast.NewDocument(
					ast.NewDocumentElement(
						"branches",
						ast.NewArray(
							ast.NewDocument(
								ast.NewDocumentElement("case", astutil.Int32(1)),
								ast.NewDocumentElement("then", astutil.Int32(2)),
							),
							ast.NewDocument(
								ast.NewDocumentElement("case", astutil.Int32(3)),
								ast.NewDocumentElement("then", astutil.Int32(4)),
							),
						),
					),
					ast.NewDocumentElement("default", astutil.Int32(5)),
				),
			),
			nil,
		},

		// Range
		{
			"1..4",
			ast.NewFunction(
				"$range",
				ast.NewArray(
					astutil.Int32(1), 
					astutil.Int32(4),
				),
			),
			nil,
		},
		{
			"1..4:2",
			ast.NewFunction(
				"$range",
				ast.NewArray(
					astutil.Int32(1), 
					astutil.Int32(4),
					astutil.Int32(2),
				),
			),
			nil,
		},

		// Unary
		{
			"NOT true",
			ast.NewFunction(
				"$not",
				astutil.True,
			),
			nil,
		},
		{
			"-true",
			ast.NewFunction(
				"$multiply",
				ast.NewArray(astutil.True, astutil.Int32(-1)),
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