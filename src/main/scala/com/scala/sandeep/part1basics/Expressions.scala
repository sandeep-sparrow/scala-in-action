package com.scala.sandeep.part1basics

object Expressions {
  private val meaningOfLife = 29 + 1 // here + expression is a scala method that takes in
  // left and right and 2 arguments and return a result.
  private val equalityTest = 1 != 2
  def main(args: Array[String]): Unit = {
    println(meaningOfLife)
    println(equalityTest)
  }
}
