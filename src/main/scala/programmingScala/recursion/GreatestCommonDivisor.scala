package programmingScala.recursion

/**
  * Created by manu on 25/06/17.
  */
object GreatestCommonDivisor {

  def gcd(a: Int, b: Int): Int = {
    if(b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    println(gcd(40, 20))
  }

}
