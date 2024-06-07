package scala.in.action

object TuplesExample {

  val namePair = ("Sandeep", "Prajapati")
  val person = ("Sandeep", "Prajapati", "+91-9819148956", 29, "Indian", "Hindu", "Here Technology", 225000)
  def main(args: Array[String]): Unit = {
    println(namePair._1)
    println(namePair._2)

    println(person._1)
    println(person._2)
    println(person._3)
    println(person._4)
    println(person._5)
    println(person._6)
    println(person._7)
    println(person._8)
  }
}
