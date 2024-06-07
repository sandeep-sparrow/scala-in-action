package scala.in.action.chp6

import scala.annotation.{tailrec, targetName}
import scala.language.implicitConversions

class Rational(n: Int, d: Int) { // 1/2
  require(d != 0, "denominator cannot be zero") // pre-condition
  private val g = gcd(n.abs, d.abs)
  var numer: Int = n / g
  var denom: Int = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  @targetName("add")
  def +(that: Rational): Rational = // 2/3
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  @targetName("add")
  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)

  @targetName("subtract")
  def -(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  @targetName("subtract")
  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  @targetName("multiply")
  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  @targetName("multiply")
  def *(i: Int): Rational =
    new Rational(numer * i, denom)

  @targetName("Division")
  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  @targetName("Division")
  def /(i: Int): Rational =
    new Rational(numer, denom * i)

  override def toString: String = numer + "/" + denom

  def lessThan(that: Rational): Boolean =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational): Rational =
    if (this.lessThan(that)) that else this

  @tailrec
  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}

object RationalApp {

  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThird = new Rational(2, 3)
    println("Rational number oneHalf: " + oneHalf)
    println("Rational number twoThird: " + twoThird)
    val addResult = oneHalf + twoThird
    val multiplyResult = oneHalf * twoThird
    val divisionResult = oneHalf / twoThird
    println("Result of Addition: " + addResult)
    println("Result of Multiplication: " + multiplyResult)
    println("Result of Division: "  +divisionResult)
    println(oneHalf lessThan twoThird)
    val maxResult = oneHalf max twoThird
    println("Result of Max: " + maxResult)
    val y = new Rational(5)
    println("Result of Auxiliary Constructor: " + y)
    val normalizedResult = new Rational(66, 42)
    println("Normalized Result: " + normalizedResult)

    val x = Rational(2, 3)
    println("X: " + x)
    val twoX = x * x
    println("twoX: " + twoX)
    val anotherTwoX = x * 2 // overload method *(2: Int): Rational
    println("anotherTwoX: " + anotherTwoX)

  }
}
