package astutil

import (
	"strconv"
	"time"

	"github.com/10gen/mongoast/ast"
	"go.mongodb.org/mongo-driver/bson/bsontype"
	"go.mongodb.org/mongo-driver/bson/primitive"
	"go.mongodb.org/mongo-driver/x/bsonx/bsoncore"
)

// AppendValueElement appends an element to the dst.
func AppendValueElement(dst []byte, key string, value bsoncore.Value) []byte {
	dst = bsoncore.AppendHeader(dst, value.Type, key)
	return append(dst, value.Data...)
}

func Array(v bsoncore.Document) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Array,
		Data: v,
	}
}

func ArrayFromValues(values ...bsoncore.Value) bsoncore.Value {
	_, arr := bsoncore.AppendArrayStart(nil)
	for i, value := range values {
		arr = AppendValueElement(arr, strconv.Itoa(i), value)
	}
	arr, _ = bsoncore.AppendArrayEnd(arr, 0)
	return Array(arr)
}

func Binary(subtype byte, data []byte) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Binary,
		Data: bsoncore.AppendBinary(nil, subtype, data),
	}
}

var True = Boolean(true)
var False = Boolean(false)

func Boolean(v bool) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Boolean,
		Data: bsoncore.AppendBoolean(nil, v),
	})
}

func DateTime(v time.Time) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.DateTime,
		Data: bsoncore.AppendDateTime(nil, v.Unix()),
	})
}

func Decimal128(v primitive.Decimal128) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Decimal128,
		Data: bsoncore.AppendDecimal128(nil, v),
	})
}

func ParseDecimal128(v string) (*ast.Constant, error) {
	d128, err := primitive.ParseDecimal128(v)
	if err != nil {
		return nil, err
	}

	return Decimal128(d128), nil
}

func Double(v float64) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Double,
		Data: bsoncore.AppendDouble(nil, v),
	})
}

func Int32(v int32) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Int32,
		Data: bsoncore.AppendInt32(nil, v),
	})
}

func Int64(v int64) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Int64,
		Data: bsoncore.AppendInt64(nil, v),
	})
}

var Null = ast.NewConstant(bsoncore.Value{
	Type: bsontype.Null,
})

func ObjectID(v primitive.ObjectID) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.ObjectID,
		Data: bsoncore.AppendObjectID(nil, v),
	})
}

func ParseObjectID(v string) (*ast.Constant, error) {
	oid, err := primitive.ObjectIDFromHex(v)
	if err != nil {
		panic("invalid ObjectID string")
	}

	return ObjectID(oid), nil
}

func Regex(pattern, options string) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Regex,
		Data: bsoncore.AppendRegex(nil, pattern, options),
	})
}

func String(v string) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.String,
		Data: bsoncore.AppendString(nil, v),
	})
}

func Timestamp(t, i uint32) *ast.Constant {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Timestamp,
		Data: bsoncore.AppendTimestamp(nil, t, i),
	})
}

func Must(c *ast.Constant, err error) *ast.Constant {
	if err != nil {
		panic(err)
	}

	return c
}
