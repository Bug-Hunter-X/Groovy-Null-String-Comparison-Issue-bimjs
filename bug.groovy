```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else {
    return str.toUpperCase()
  }
}

println myMethod(null)
println myMethod("")
```