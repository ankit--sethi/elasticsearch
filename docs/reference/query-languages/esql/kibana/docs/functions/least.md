% This is generated by ESQL's AbstractFunctionTestCase. Do not edit it. See ../README.md for how to regenerate it.

### LEAST
Returns the minimum value from multiple columns. This is similar to [`MV_MIN`](https://www.elastic.co/docs/reference/query-languages/esql/functions-operators/mv-functions#esql-mv_min) except it is intended to run on multiple columns at once.

```esql
ROW a = 10, b = 20
| EVAL l = LEAST(a, b)
```
