package scala.in.action
import scala.collection.mutable.Set;

object Sets {

  private var jetSet = Set("Boeing", "Airbus")
  jetSet += "IndieGo"
  def main(args: Array[String]): Unit = {
    jetSet.foreach(println)
  }
}
