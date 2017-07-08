package programmingScala.classes

/**
  * Created by manu on 6/07/17.
  */
abstract class IntSet {

  def incl(x:Int): IntSet
  def contains(x:Int):Boolean
  def union(set: IntSet):IntSet
}

object EmptySet extends IntSet{
  override def contains(x: Int): Boolean = false

  override def incl(x: Int): IntSet = new NonEmptySet(x, EmptySet, EmptySet)

  override def toString: String = "Empty"

  override def union(set: IntSet): IntSet = set
}

class NonEmptySet(elem:Int, left:IntSet, right:IntSet) extends IntSet{
  override def contains(x: Int): Boolean = {
    if(x < elem) left.contains(x)
    else if(x>elem) right.contains(x)
    else true
  }

  override def incl(x: Int): IntSet = {
    if(x < elem) new NonEmptySet(elem, left.incl(x), right)
    else if(x>elem) new NonEmptySet(elem, left, right.incl(x))
    else this
  }

  override def toString: String = "{" + left + elem + right +"}"

  override def union(set: IntSet): IntSet = (left union right) union set incl(elem)
}

object IntSet{

  def main(args: Array[String]): Unit = {
    val t1 = new NonEmptySet(3, EmptySet, EmptySet)

    val t2 = t1.incl(4)

    println(t2.toString)
  }

}
