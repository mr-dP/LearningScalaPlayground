// Databricks notebook source
// Expressions are structures that can be evaluated to values

// COMMAND ----------

val meaningOfLife = 40 + 2
// The structure "40 + 2" is an expression and it evaluates to 42 and "meaningOfLife" takes the value 42

println(meaningOfLife)

// COMMAND ----------

// mathematical expressions: +, -, *, /, bitwise |, &, <<, >>, >>>
//  |     -> bitwise OR
//  &     -> bitwise AND
//  <<    -> bitwise left shift
//  >>    -> bitwise right shift
//  >>>   -> bitwise right shift with 0 extension
//  ~     -> bitwise negation
//  ^     -> bitwise XOR

// COMMAND ----------

val mathExpression = 2 + 3 * 4
// "3 * 4" is evaluated first

// COMMAND ----------

// comparison expressions: <, <=, >, >=, ==, !=
val equalityTest = 1 == 2
// All comparison operations returns a Boolean

// equalityTest: Boolean = false

// COMMAND ----------

// boolean expressions: !, ||, &&
//  !   ->  Negation operator
//  ||  ->  Logical OR
//  &&  ->  Logical AND
val nonEqualityTest = !equalityTest
// Return a Boolean

// nonEqualityTest: Boolean = true

// COMMAND ----------

// instructions vs expressions
//  - expressions evaluate to a value
//  - instructions are executed
// In Scala and functional programming, we think in terms of Expressions

// no concept of instructions in imperative programming like Java, Python, C; whereby you write insturctions like do this, do that, do some more, repeat this, so on and so forth

// COMMAND ----------

// "if" clause in Scala are expressions

val aCondition = true
val anIfExpression = if (aCondition) 45 else 99
println(anIfExpression)     //  45

// COMMAND ----------

println(if (aCondition) 45 else 99)

// 45

// COMMAND ----------

// code blocks
val aCodeBlock = {
  // local values
  val localValue = 78
  // expressions...
  // last expression = value of the block
  localValue + 54       //  in other programming language --> "retrun localValue + 54"
}

// A Code Block in Scala is itself a big expression and the value of this expression is the value of the last expression in the block

// aCodeBlock: Int = 132

// COMMAND ----------

// everything in scala is an expression
//  - if structures
//  - code blocks
//  - function implementations

// COMMAND ----------

/**
  * Exercise:
  *   Without running the code, what do you think these values will print out?
  */

// COMMAND ----------

// 1
val someValue = {
  2 < 3
}

// someValue: Boolean = true

// COMMAND ----------

// 2
val someOtherValue = {
  if (someValue) 239 else 986
  42
}

// someOtherValue: Int = 42

// COMMAND ----------

// 3
val yetAnotherValue = println("Scala")

// "println("Scala")" will print the string "Scala" to the console
// But "yetAnotherValue" needs also to have a value. The value is returned by the expression of printing itself which is a very special type called Unit.

// Scala
// yetAnotherValue: Unit = ()

// COMMAND ----------

// The type "Unit" is equivalent to "void" in other programming languages
// "Unit" has one possible value "()"
val theUnit: Unit = ()
println(theUnit)      // ()

// COMMAND ----------

// the expressions such as "println" will return "Unit" because they do not return any meaningful value
