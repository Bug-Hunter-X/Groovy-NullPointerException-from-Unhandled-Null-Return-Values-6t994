```groovy
def myMethod(param) {
  if (param == null) {
    return null // Return null, but handle it appropriately in calling method
  }
  // ... rest of the method
}

def anotherMethod() {
  def result = myMethod(null)
  // Solution 1: Explicit null check
  if (result != null) {
    println result.someProperty
  } else {
    println "Parameter was null, handling gracefully"
  }

  // Solution 2: Using the Elvis operator
  println (result?.someProperty ?: "Parameter was null, handling gracefully")
}
```