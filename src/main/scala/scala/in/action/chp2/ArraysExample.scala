package scala.in.action

object ArraysExample {

  private val greetingMsg = new Array[String](3) // array itself is mutable
  greetingMsg(0) = "Hello "
  greetingMsg(1) = ", Welcome "
  greetingMsg(2) = " to Scala programming "
  // for concise way of declaring arrays
  private val numNames = Array("zero", "one", "two")
  def main(args: Array[String]): Unit = {
    for(i <- 0 to 2)
      print(greetingMsg(i))
      print(numNames(i))
  }
}
