package com.scala.sandeep.part2oo

object MethodNotation {

  class Person(val name: String){
    infix def greet(another: Person): String = s"$name says: Hi, ${another.name}, how are you?"
    infix def likesMovie(movie: String) = s"$name says: i adore the move $movie"
    def apply(progLang: String): Unit = println(s"[$name] Programming in $progLang")
    def apply(progLang: String, algo: String): Unit = println(s"[$name] Programming in $progLang and algorithm is $algo")
  }

  private val alice = Person("Alice")
  private val bob = Person("Bob")
  def main(args: Array[String]): Unit = {
    println(alice.greet(bob))
    println(alice greet bob) // -> infix notation - possible only with a single arg
    //      ^^^^^ ^^^^^ ^^^
    //       inst def   arg
    // only work with single args
    println(alice likesMovie "Speed")
    alice("Scala")
    alice("Scala", "Dynamic Programming")
  }
}

