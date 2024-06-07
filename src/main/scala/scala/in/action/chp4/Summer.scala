package scala.in.action.chp4
import scala.in.action.chp4.ClassBasics.ChecksumAccumulator.calculate

object Summer { // STANDALONE SINGLETON OBJECT
  def main(args: Array[String]): Unit = {
    for(arg <- args)
      println(arg + ": " + calculate(arg))
  }
}