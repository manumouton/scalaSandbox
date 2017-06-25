package programmingScala.recursion

import scala.annotation.tailrec

/**
  * Created by manumouton on 08/05/2017.
  */
class Factorial {

}

object Factorial {

  def factorial(i: Int): Long = {
    @tailrec
    def fact(i: Int, accumulator: Int): Long = {
      if (i <= 1) accumulator
      else fact(i - 1, i * accumulator)
    }

    fact(i, 1)
  }

  def factorialBis(n:Int): Int = {
    if(n == 0) 1 else n * factorialBis(n-1)
  }

  def main(args: Array[String]): Unit = {
    (0 to 5) foreach( i => println(factorial(i)))
  }
}
