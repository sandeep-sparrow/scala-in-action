package scala.in.action.chp2

object Functions {

  def max(x: Int, y: Int): Int = {
    if(x > y) x
    else y
  }

  def greet() = println("Hello, World!")

  def main(args: Array[String]): Unit = {
    val result = max(5, 6)
    println(result)
    greet()
  }
}
