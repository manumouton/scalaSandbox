package programmingScala.rationals

/**
  * Created by manu on 2/07/17.
  */
class Rational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a%b)

  def numerator = x
  def denominator = y

  def less(that: Rational) = numerator * that.denominator < that.numerator * denominator

  def max(that: Rational) = if (this.less(that)) that else this

  def add(that : Rational) = {
    new Rational(
      numerator * that.denominator + that.numerator + denominator,
      denominator + that.denominator
    )
  }


  def neg: Rational = new Rational(-numerator, denominator)

  def sub(that: Rational) = add(that.neg)

  override def toString = {
    val g = gcd(numerator, denominator)
    numerator/g + "/" + denominator/g
  }
}

object Rational{

  def main(args: Array[String]): Unit = {
    val r = new Rational(1,2)

    r.numerator
    r.denominator
  }

  val another = new Rational(1, 4)


}