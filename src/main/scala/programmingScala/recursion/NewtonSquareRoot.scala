package programmingScala.recursion

/**
  * Created by manu on 25/06/17.
  */
object NewtonSquareRoot {

  def sqrt(x: Double): Double ={
    def sqrtIter(guess: Double): Double =
      if(isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      scala.math.abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1)
  }

  def sqrtFixedPoint(x: Double): Double = FixedPoints.fixedPoints(y => x / y)(1)

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

  def sqrtFixedPointAvgDamp(x: Double) = FixedPoints.fixedPoints(averageDamp(y => x / y))(1)

  def main(args: Array[String]): Unit = {
    println(sqrt(2))

    println(sqrt(4))

    println(sqrt(1e-10))

    println(sqrt(1e26))
  }

}
