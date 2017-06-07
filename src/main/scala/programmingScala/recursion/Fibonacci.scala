package programmingScala.recursion

import scala.annotation.tailrec

/**
  * Created by mou on 08/05/2017.
  */
class Fibonacci {

}

object Fibonacci {
  def fibonacci(n: Int): Long = {
    @tailrec
    def fib(n: Int, a: Int, b: Int): Long = {
      if (n <= 0) return a
      fib(n - 1, b, a + b)
    }

    fib(n, 0, 1)
  }

  //  @tailrec => does not compile
  def fibonacciNotTailRec(n: Int): Long = {
    if (n <= 1) 1L
    else fibonacciNotTailRec(n - 2) + fibonacciNotTailRec(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(10))

    println(fibonacciNotTailRec(10))
  }
}
