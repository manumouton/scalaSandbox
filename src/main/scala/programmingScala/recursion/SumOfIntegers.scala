package programmingScala.recursion

/**
  * Created by manu on 2/07/17.
  */
object SumOfIntegers {

  /**
    * Sum of the integers between a and b
    * @param a
    * @param b
    * @return
    */
  def sumInts(a:Int, b:Int): Int = {
    if(a > b) 0 else a + sumInts(a+1, b)
  }

  def cube(x: Int): Int = x * x * x

  def sumCubes(a:Int, b:Int): Int = {
    if(a > b) 0 else cube(a) + sumCubes(a+1, b)
  }



}
