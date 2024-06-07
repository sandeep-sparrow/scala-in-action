package scala.in.action.chp4
import scala.in.action.chp4.ClassBasics.ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {

  for(season <- List("Fall", "Winter", "Monsoon", "Summer"))
    println(season + ": " + calculate(season))
}
