package com.scala.sandeep.part1basics

object Instructions {

  private val printing : Unit = println("This is instruction")
  private val theUnit: Unit = ()

  private val aCodeBlock: Unit = {
    val aLocalValue = 25
    println("Instruction 1")
    println("Instruction 2")
  }
  def main(args: Array[String]): Unit = {
  }
}
