# Groovy NullPointerException from Unhandled Null Return Values

This repository demonstrates a common Groovy error:  unexpected `NullPointerExceptions` stemming from methods that return `null` without sufficient error handling in the calling code.  Groovy's dynamic typing and loose null handling can make these difficult to spot.

The `bug.groovy` file shows a method that returns `null` for a `null` parameter.  The problem arises when this null value isn't handled correctly by the calling method, leading to an NPE.

The `bugSolution.groovy` file demonstrates a solution using explicit null checks or the Elvis operator to prevent the exception. 

This example highlights the importance of robust error handling and defensive programming when working with potentially null values in Groovy.