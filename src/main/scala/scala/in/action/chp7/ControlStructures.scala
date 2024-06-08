package scala.in.action.chp7

object ControlStructures {

  private var fileName = "default.txt"

  // gcd calculation via while loop
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while(a!=0){
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcdRecursion(x: Long, y: Long): Long = { //10, 15
    if(y == 0) x else gcdRecursion(y, x % y) //15, 10: 10, 5: 5, 0 == y == 0
    // x = 5 is return as the result
  }

  def main(args: Array[String]): Unit = {
    if(!args.isEmpty)
      fileName = args(0)

    println(fileName)

    val g = gcdLoop(10, 15)
    println(g)
    val gRec = gcdRecursion(10, 15)
    println(gRec)
    println(10 % 15)
  }
}
