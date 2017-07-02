package programmingScala.recursion

/**
  * Created by manu on 2/07/17.
  */
object SumOfIntegersCurrying {

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b:Int): Int =
      if(a > b) 0
      else f(a) + sumF(a+1, b)
    sumF
  }

  def sumInts = sum(x => x)

  def main(args: Array[String]): Unit = {
    println(sumInts(1, 2))
  }
}
