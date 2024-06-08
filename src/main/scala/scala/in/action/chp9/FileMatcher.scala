package scala.in.action.chp9

import java.io.File

object FileMatcher {

  private def fileHere = new File("./src/main/scala/scala/in/action/chp9").listFiles

  // helper method
  private def fileMatching(query: String,
                           matcher: (String, String) => Boolean) = { // control abstraction, Higher order function in react
    // (arg1: query: String, arg2: function_name - matcher: (String, String) => Boolean (check condition)
    for (file <- fileHere; if matcher(file.getName, query))
      yield file
  }

  def filesEnding(query: String): Array[File] =
    fileMatching(query, _.endsWith(_)) // (fileName: String, query: String) => fileName.endsWith(query)
  // the above example uses the place holder syntax

  def filesContaining(query: String): Array[File] =
    fileMatching(query, _.contains(_))

  def filesRegex(query: String): Array[File] =
    fileMatching(query, _.matches(_))

  def containingNeg(nums: List[Int]): Boolean = {
    var exists = false
    for(num <- nums)
      if(num < 0)
        exists = true
    exists
  }

  private def conciseContainingNeg(nums: List[Int]): Boolean = nums.exists(_ < 0)

  def main(args: Array[String]): Unit = {
    val result = filesEnding("scala")
    result.foreach(println)
    println(conciseContainingNeg(List(1, 4, 5, -7, 3)))
  }
}
