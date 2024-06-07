package scala.in.action.chp4

import scala.collection.mutable

object ClassBasics {

  object ChecksumAccumulator extends ChecksumCalculator { // companion-singleton object of ChecksumAccumulator class
    private val cache = mutable.Map.empty[String, Int]

    def calculate(s: String): Int =
      if(cache.contains(s))
        cache(s)
      else {
        val acc = new ChecksumAccumulator
        for(c <- s)
          acc.add(c.toByte)

        val cs = acc.checksum()
        cache += (s -> cs)
        cs
      }
  }

  abstract class ChecksumCalculator{
    def calculate(s: String): Int
  }

  class ChecksumAccumulator{ // companion class of Singleton object and they can access each other private members
    // you private fields and methods
    private var sum = 0

    // access modifier - public i.e. nothing is default access modifier in Scala
    private def add(b: Byte): Unit = sum += b

    private def checksum(): Int = ~(sum & 0xFF) + 1
  }

  private val acc = new ChecksumAccumulator
  private val csa = new ChecksumAccumulator // different memory location
  //acc.sum = 3 : is not accessible due to private
  def main(args: Array[String]): Unit = {
    // println(acc.sum)
    // println(csa.sum)
    val result = ChecksumAccumulator.calculate("Sandeep Prajapati")
    println(result)
  }
}