# MQL (Mongo Query Language) Transpiler

MongoDB already has a [query language](https://docs.mongodb.com/manual/aggregation/) .
It's JSON. For smaller queries, it's simple enough to use. And even for larger ones,
it's well structured and easy to understand.

That being said, it is very verbose and for larger queries, it can be
daunting to accomplish complicated things. There are tricks that can be
used depending on your implementation language. For instance, if you
are using the shell, you can create javascript functions that encapsulate
functionality; [Asya does this really well](http://www.kamsky.org/stupid-tricks-with-mongodb).

This project was built because I work(ed) on a project called the BI-connector, which
translates MySQL queries into the [MongoDB Aggregation Framework](https://docs.mongodb.com/manual/aggregation/).
These can tend to be very, very large queries and we have many unit tests
built around asserting that we have generated the expected agg query. Hence,
this was a simple language that let me express the aggregation framework in a more natural
syntax.

## Examples

```
    FROM bar
    MATCH a > 10 OR a < 20
    PROJECT a, b := { c := g.d[0..36 step 12], e := f.map($x => $x + 5) }
```

```json
[
   {
      "$match":{
        "$or":[
            { "a":{ "$gt":10 } },
            { "a":{ "$lt":20 } }
         ]
      }
   },
   {
      "$project":{
         "a":"$a",
         "b":{
            "c":{
               "$let":{
                  "vars":{
                     "array":{ "$slice":["$g.d", 0, { "$subtract":[ 36, 0 ] } ]
                     }
                  },
                  "in":{
                     "$map":{
                        "input":{
                           "$filter":{
                              "input":{
                                 "$zip":{
                                    "inputs":[
                                       { "$range":[0, { "$size": ["$$array"] } ] },
                                       "$$array"
                                    ]
                                 }
                              },
                              "as":"x",
                              "cond":{
                                 "$eq": [0, { "$mod":[{"$arrayElemAt": ["$$x", 0] }, 12]}]
                              }
                           }
                        },
                        "as":"x",
                        "in": { "$arrayElemAt": ["$$x", 1 ]}
                     }
                  }
               }
            },
            "e":{
               "$map":{
                  "input":"$f",
                  "as":"x",
                  "in":{ "$add": ["$$x", 5] }
               }
            }
         }
      }
   }
]
```
