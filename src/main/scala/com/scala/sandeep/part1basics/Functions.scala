package com.scala.sandeep.part1basics

object Functions {

  private def aFunction(a: String, b: Int): String = {
    // always be a single instruction
    a + " " + b
    // not required to mention return keyword
  }

  // invocation
  private val anInvocation = aFunction("Scala", 20)

  private def bFunction(a: String, b: String) = a + b

  def main(args: Array[String]): Unit = {
    println(aFunction("Scala", 999))
    println(anInvocation)
    println(bFunction("Sandeep", "Prajapati"))
  }
}
