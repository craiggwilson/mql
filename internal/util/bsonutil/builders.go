package bsonutil

import (
	"strconv"

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

func Boolean(v bool) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Boolean,
		Data: bsoncore.AppendBoolean(nil, v),
	}
}

func CodeWithScope(code string, scope bsoncore.Document) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.CodeWithScope,
		Data: bsoncore.AppendCodeWithScope(nil, code, scope),
	}
}

func DBPointer(ns string, oid primitive.ObjectID) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.DBPointer,
		Data: bsoncore.AppendDBPointer(nil, ns, oid),
	}
}

func DateTime(v int64) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.DateTime,
		Data: bsoncore.AppendDateTime(nil, v),
	}
}

func Decimal128(v primitive.Decimal128) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Decimal128,
		Data: bsoncore.AppendDecimal128(nil, v),
	}
}

func Decimal128FromString(v string) bsoncore.Value {
	d128, err := primitive.ParseDecimal128(v)
	if err != nil {
		panic(err)
	}
	return bsoncore.Value{
		Type: bsontype.Decimal128,
		Data: bsoncore.AppendDecimal128(nil, d128),
	}
}

func Document(v bsoncore.Document) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.EmbeddedDocument,
		Data: v,
	}
}

func DocumentFromElements(elems ...interface{}) bsoncore.Value {
	if len(elems)%2 != 0 {
		panic("must have an even number of elems")
	}

	_, doc := bsoncore.AppendDocumentStart(nil)
	for i := 0; i < len(elems); i += 2 {
		doc = AppendValueElement(doc, elems[i].(string), elems[i+1].(bsoncore.Value))
	}
	doc, _ = bsoncore.AppendDocumentEnd(doc, 0)

	return Document(doc)
}

func Double(v float64) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Double,
		Data: bsoncore.AppendDouble(nil, v),
	}
}

func EmptyArray() bsoncore.Value {
	_, arr := bsoncore.AppendArrayStart(nil)
	arr, _ = bsoncore.AppendArrayEnd(arr, 0)

	return Array(arr)
}

func EmptyDocument() bsoncore.Value {
	_, doc := bsoncore.AppendDocumentStart(nil)
	doc, _ = bsoncore.AppendDocumentEnd(doc, 0)

	return Document(doc)
}

func Int32(v int32) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Int32,
		Data: bsoncore.AppendInt32(nil, v),
	}
}

func Int64(v int64) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Int64,
		Data: bsoncore.AppendInt64(nil, v),
	}
}

func JavaScript(v string) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.JavaScript,
		Data: bsoncore.AppendJavaScript(nil, v),
	}
}

func MaxKey() bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.MaxKey,
	}
}

func MinKey() bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.MaxKey,
	}
}

func Null() bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Null,
	}
}

func ObjectID(v primitive.ObjectID) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.ObjectID,
		Data: bsoncore.AppendObjectID(nil, v),
	}
}

func ObjectIDFromHex(hex string) bsoncore.Value {
	v, err := primitive.ObjectIDFromHex(hex)
	if err != nil {
		panic("invalid ObjectID string")
	}
	return ObjectID(v)
}

func Regex(pattern, options string) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Regex,
		Data: bsoncore.AppendRegex(nil, pattern, options),
	}
}

func String(v string) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.String,
		Data: bsoncore.AppendString(nil, v),
	}
}

func Symbol(v string) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Symbol,
		Data: bsoncore.AppendSymbol(nil, v),
	}
}

func Timestamp(t, i uint32) bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Timestamp,
		Data: bsoncore.AppendTimestamp(nil, t, i),
	}
}

func Undefined() bsoncore.Value {
	return bsoncore.Value{
		Type: bsontype.Undefined,
	}
}
