```groovy
def myMethod(param) {
  if (param == null) {
    return null // This is correct, but can lead to unexpected behavior if not handled properly
  }
  // ... rest of the method
}

// Example of how the null return can cause issues:
def anotherMethod() {
  def result = myMethod(null)
  println result.someProperty // This will throw a NullPointerException
}
```