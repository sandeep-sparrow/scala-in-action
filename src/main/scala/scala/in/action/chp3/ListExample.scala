package scala.in.action.chp3

object ListExample {

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  def main(args: Array[String]): Unit = {
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)
    println(oneTwoThreeFour(2))
    println(oneTwoThreeFour.map(s => s == 4 || s == 3)); // this return a boolean list
    println(oneTwoThreeFour.contains(5)) // return boolean true or false
    println(oneTwoThreeFour.filter(s => s == 4 || s == 3)) // return a new list with element
    println(oneTwoThreeFour.map(s => s + 10))
    println(oneTwoThreeFour.mkString(", "))
    println(oneTwoThreeFour.reverse)
  }
}
