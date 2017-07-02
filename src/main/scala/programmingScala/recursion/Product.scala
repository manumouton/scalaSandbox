package programmingScala.recursion

/**
  * Created by manu on 2/07/17.
  */
object Product {

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if(a > b) 1
    else f(a) * product(f)(a+1, b)
  }

  def fact(n: Int) = product(x => x)(1, n)

  /* function that generalize sum and product */
  def mapReduce(f : Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if(a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
  }

  def productBis(f: Int => Int)(a:Int, b:Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  def main(args: Array[String]): Unit = {
    println(productBis(x => x)(1, 5))
  }
}
