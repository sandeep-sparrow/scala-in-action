package scala.in.action

object printargs {


  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }

    args.foreach(arg => print(arg))
    args.foreach(println)
  }
}
