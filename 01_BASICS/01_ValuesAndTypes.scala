// Databricks notebook source
object ValuesAndTypes {

  // values
  val meaningOfLife: Int = 42
  // Values cannot be reassigned
  // similar to:
  //       const int meaningOfLife = 42
  // think of the VALUES as constants

  // reassigning is not allowed
  // meaningOfLife = 45    // error: reassignment to val

  // TYPE INFERENCE
  // The type ": Int" is optional in Scala
  val anInteger = 67    //  : Int is optional
  // The compiler can tell whether "anInteger" is of type "Int" by looking at the right hand side

  // common types / primitive types in Scala which are mapped to regular types in JVM
  val aBoolean: Boolean = true      //  or "false"
  val aChar: Char = 'a'             //  Characters are denoted by simple characters in between single quotes
  val anInt: Int = 78               //  4-bytes integer ; -2 billion and 2 billion
  val aShort: Short = 5263          //  2-bytes integer
  val aLong: Long = 48582394752934L //  8-bytes
  val aFloat: Float = 2.4f          //  4-bytes
  val aDouble: Double = 3.14        //  8-bytes

  // string = A sequence of characters in between double quotes
  val aSring: String = "Scala"

  def main(args: Array[String]): Unit = {

  }
}
