package scala.in.action.chp8

import scala.io.Source

object LongLines {

  private def processFile(fileName: String, width: Int): Unit = { // general nested scala provider
    def processLine(fileName: String, width: Int, line: String): Unit = {
      if (line.length > width)
        println(fileName + ": " + line.trim)
    }
    val source = Source.fromFile(fileName)
    for(line <- source.getLines())
      processLine(fileName, width, line)
  }

  private val increase = (x: Int) => {
    println("We")
    println("are")
    println("here!")
    x + 1
  }

  /*
    var increase = (x: number) => {
      console.log("We are here!")
      return x = x + 9999
    }
    console.log(increase(10)) -> this is exact same as one in typscript
  */

  // function literal - exist in our source code
  // function value - exists as object during runtime

  def main(args: Array[String]): Unit = {
    processFile("src/main/scala/scala/in/action/chp8/sample.txt", 5)
    println(increase(10)) // invocation
    val someNumbers = List(-11, -10, 10, 5, -3, 35)
    val positiveNumbers = someNumbers.filter(num => num > 0)
    positiveNumbers.foreach(num => print(s"$num "))
  }
}
