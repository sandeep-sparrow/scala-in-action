package scala.in.action

object GrowingNewTypes {

  def factorial(x: BigInt): BigInt =
    if(x == 0) 1 else x * factorial(x-1)

  def main(args: Array[String]): Unit = {
    println(factorial(30))
    println("Sandeep Prajapati".exists(_.isUpper))
  }
}
