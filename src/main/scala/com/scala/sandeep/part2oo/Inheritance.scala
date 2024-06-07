package com.scala.sandeep.part2oo

object Inheritance {

  class VideoGame {
    val gameType = "interactive"
    def play(): Unit = println("game running!")
  }

  // single-class inheritance
  class Shooter extends VideoGame {
    def multiplayer(): Unit = {
      play()
      println("Boom Boom!")
    }
  }

  class Person(val mame: String, val age: Int)
  class Adult(name: String, age: Int) extends Person(name, age)

  private val crsysis = Shooter()
  private val daniel = new Adult("Daniel", 99)

  // inherit the primary constructor
  def main(args: Array[String]): Unit = {
    println(crsysis.gameType)
    crsysis.multiplayer()
    println(daniel.mame)
  }
}
