package programmingScala.datastructures

import java.util.NoSuchElementException

/**
  * Created by manu on 8/07/17.
  */
trait List[+T] {

  def isEmpty: Boolean

  def head: T

  def tail: List[T]

}

class Cons[T](val head:T, val tail:List[T]) extends List[T]{

  override def isEmpty: Boolean = false

  def singleton[T](elem: T) = new Cons[T](elem, Nil)

}

object Nil extends List[Nothing]{

  override def isEmpty: Boolean = true

  override def head: Nothing = throw new NoSuchElementException("Nil.head")

  override def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {
  val x: List[String] = Nil
}

object List {
  //List(1,2) = List.apply(1,2)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, Nil))
  def apply[T](): List[T] = Nil

}

object nth{

  def nth[T](i: Int, xs: List[T]): T =
    if(xs.isEmpty) throw new IndexOutOfBoundsException
    else if (i == 0) xs.head
    else nth(i-1, xs.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, Nil)))

  def main(args: Array[String]): Unit = {
    nth(2, list)
    nth(4, list)
    nth(-1, list)
  }
}
