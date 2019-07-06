# MQL (Mongo Query Language) Transpiler

MongoDB already has a [query language](https://docs.mongodb.com/manual/aggregation/).
It's JSON. For smaller queries, it's simple enough to use. And even for larger ones,
it's well structured and easy to understand.

That being said, it is very verbose and for larger queries, it can be
daunting to accomplish complicated things. There are tricks that can be
used depending on your implementation language. For instance, if you
are using the shell, you can create javascript functions that encapsulate
functionality; [Asya does this really well](http://www.kamsky.org/stupid-tricks-with-mongodb).

This project was built because I have worked on a number of projects that require building
very large queries for testing and we have many unit tests built around asserting that we have 
generated the expected [agg query](https://docs.mongodb.com/manual/aggregation/). Hence,
this was a simple language that let me express the aggregation framework in a more natural
syntax.

## Running

### Interactive Mode
This requires a running MongoDB instance.

`go run mql.go` will connect to a MongoDB instance at `localhost:27017` by default. Providing a `--uri` with a connection string will allow you to query
a non-default MongoDB instance.

* Each statement must be terminated with a `;` in interactive mode.
* `SHOW DATABASES` will list all the databases.
* `USE <DATABASE NAME>` will change to the given database.
* `SHOW COLLECTIONS` will list all the collections in the current database.
* `FROM <COLLECTION NAME> <QUERY>` will issue the query against the specified collection.

### Translation Mode
This does NOT require a running MongoDB instance.

`go run mql.go translate <query>` will translate the query into either shell syntax or extended json, with the default being the shell. In addition, providing the `-o` flag will optimize the query.

## Language

The language is defined in the [MQL.g4](./internal/grammar/MQL.g4) [antlr](https://www.antlr.org/) file.

Some general statements:
* The language uses case-insensitive keywords but identifiers are all case-sensitive.
* Each stage ($match, $project, etc...) is called the same thing, just without a `$`.
* All columns are referenced without a `$`.
* All variables are referenced with only 1 `$`.

### Examples

```
❯ go run mql.go translate "PROJECT {a, b, !c}"
[
        {"$project": {"a": NumberInt("1"),"b": NumberInt("1"),"c": NumberInt("0")}}
 ]
```

```
❯ go run mql.go translate "PROJECT {a: a + 1, b: b[4]}"
[
        {"$project": {"a": {"$add": ["$a",{"$literal": NumberInt("1")}]},"b": {"$arrayElemAt": ["$b",{"$literal": NumberInt("4")}]}}}
 ]
```

```
❯ go run mql.go translate "PROJECT {b: b[a..10:2]}"
[
        {"$project": {"c": NumberInt("0")}}
 ]
```

```
// project column `b` (which is an array) starting from index `a` up to 10 stepping by 2.
❯ go run mql.go translate "PROJECT {b: b[a..10:2]}"
[
        {"$project": {"b": {"$let": {"vars": {"array": {"$slice": ["$b","$a",{"$subtract": [{"$literal": NumberInt("10")},"$a"]}]}},"in": {"$map": {"input": {"$filter": {"input": {"$zip": {"inputs": [{"$range": [{"$literal": NumberInt("0")},{"$size": "$$array"}]},"$$array"]}},"as": "x","cond": {"$eq": [{"$literal": NumberInt("0")},{"$mod": [{"$arrayElemAt": ["$$x",{"$literal": NumberInt("0")}]},{"$literal": NumberInt("2")}]}]}}},"as": "x","in": {"$arrayElemAt": ["$$x",{"$literal": NumberInt("1")}]}}}}}}}
 ]
```

```
❯ go run mql.go translate "LIMIT 4 MATCH a > 40"
[
        {"$limit": NumberLong("4")},
        {"$match": {"a": {"$gt": NumberInt("40")}}}
 ]
```

```
❯ go run mql.go translate -o "PROJECT {a, b} PROJECT {b}"
[
        {"$project": {"b": NumberInt("1")}}
 ]
 ```

 ```
 ❯ go run mql.go translate -o "PROJECT {a: zip(1..10, a[4..])}"
[
        {"$project": {"a": {"$zip": [{"$range": [{"$literal": NumberInt("1")},{"$literal": NumberInt("10")}]},{"$slice": ["$a",{"$subtract": [{"$literal": NumberInt("4")},{"$size": "$a"}]}]}]}}}
 ]
 ```
 
 ```
 ❯ go run mql.go translate -o "PROJECT {a: filter(input: a, as: x, cond: x % 2 = 0)}"
[
        {"$project": {"a": {"$filter": {"input": "$a","as": "$x","cond": {"$eq": [{"$mod": ["$x",{"$literal": NumberInt("2")}]},{"$literal": NumberInt("0")}]}}}}}
 ]
 ```