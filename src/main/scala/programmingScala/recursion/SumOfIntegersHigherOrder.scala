package programmingScala.recursion

/**
  * Created by manu on 2/07/17.
  */
object SumOfIntegersHigherOrder {

  def sum(f: Int => Int, a: Int, b: Int): Int ={
    if (a > b) 0
    else f(a) + sum(f, a+1, b)
  }

  def sumTailrec(f: Int => Int, a: Int, b:Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if(a > b) acc
      else loop(a + 1, f(a) + acc)
    }

    loop(a, 0)
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

  /* Named function version */
  def sumInts(a:Int, b:Int): Int = {
    sum(id, a, b)
  }

  /* Anonymous version */
  def sumIntsAnonymous(a:Int, b:Int): Int = {
    sum(x => x, a, b)
  }

  /* Named function version */
  def sumCubes(a:Int, b:Int): Int = {
    sum(cube, a, b)
  }

  /* Anonymous version */
  def sumCubesAnonymous(a: Int, b: Int): Int = {
    sum(x => x * x * x, a, b)
  }

  /* Named function version */
  def sumFactorial(a: Int, b: Int): Int = {
    sum(fact, a, b)
  }
}
