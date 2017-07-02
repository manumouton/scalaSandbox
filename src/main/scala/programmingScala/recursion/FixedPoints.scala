package programmingScala.recursion

import math.abs

/**
  * Created by manu on 2/07/17.
  */
object FixedPoints {

  val tolerance = 0.0001

  def isClosedEnough(x: Double, y: Double) = abs((x - y)/x) / x < tolerance

  def fixedPoints(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if(isClosedEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  def main(args: Array[String]): Unit = {
    print(fixedPoints(x => 1 + x/2)(1))
  }

}
