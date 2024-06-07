package scala.in.action.chp3

object Hybrid {

  private val numbers: Array[String] = Array("one", "two", "three")
  private def formatNumbers(numbers: Array[String]) = numbers.mkString("\n")
  def main(args: Array[String]): Unit = {
    for(number <- numbers)
      println(number) // imperative style

    numbers.foreach(println) // is bit closer to functional style of programming
    // but still has side effect

    println(formatNumbers(numbers)) // pure functional style
    // every useful program is likely to have side effect of some sort;
    // otherwise, it would not be able to provide values to the outside world!
    assert(formatNumbers(numbers) == "one\ntwo\nthree")

    
    // TIP: prefer vals, immutable objects like LIST, and method without side effects
  }
}
