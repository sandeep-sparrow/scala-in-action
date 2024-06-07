package scala.in.action

import scala.io.Source

object ReadFile {
  
  private def widthOfLength(s: String) = s.length.toString.length
  
  def main(args: Array[String]): Unit = {
    if(args.length > 0){
      val lines = Source.fromFile(args(0)).getLines().toList
      var maxWidth = 0
      for(line <- lines)
        maxWidth = maxWidth.max(widthOfLength(line));
        
      for(line <- lines)
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " | " + line)
    }else{
      println("Please enter file name")
    }
  }
}
