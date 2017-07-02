package programmingScala.recursion

/**
  * Created by manu on 2/07/17.
  */
object SumOfIntegersHigherOrder {

  def sum(f: Int => Int, a: Int, b: Int): Int ={
    if (a > b) 0
    else f(a) + sum(f, a+1, b)
  }

  def id(a:Int): Int = {
    a
  }

  def cube(a: Int): Int = {
    a * a * a
  }

  def fact(a: Int): Int = {
    if(a == 0) 1 else fact(a-1)
  }

  def sumInts(a:Int, b:Int): Int = {
    sum(id, a, b)
  }

  def sumCubes(a:Int, b:Int): Int = {
    sum(cube, a, b)
  }

  def sumFactorial(a: Int, b: Int): Int = {
    sum(fact, a, b)
  }

}
