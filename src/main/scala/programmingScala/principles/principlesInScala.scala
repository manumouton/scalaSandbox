package programmingScala.principles

/**
  * Created by mou on 03/05/2017.
  */
class principlesInScala {


  //Defining some partial functions
  def pf1: PartialFunction[Any, String] = { case s:String => "YES" }
  def pf2: PartialFunction[Any, String] = { case d:Double => "YES" }

  val pf = pf1 orElse pf2

  def tryPf(x: Any, f: PartialFunction[Any, String]): String = {
    try {
      f(x).toString
    }
    catch {
      case _: MatchError => "Error!!"
    }
  }
}

object principlesInScala{

  //Immutable variable
  val value = "test"
  // Mutable one
  var valu = "test"

  val mySeq = Seq("1", 2, 3, "*34")

  val sequence = 0 to mySeq.length

  def main(args: Array[String]): Unit = {
    println(sequence)

    val principlesInScala = new principlesInScala

    println(principlesInScala.pf1("test"))
    println(principlesInScala.pf1(1))

    println(principlesInScala.pf(5))

    println(principlesInScala.tryPf("test", principlesInScala.pf1))
    println(principlesInScala.tryPf(1, principlesInScala.pf1))
    println(principlesInScala.tryPf(5, principlesInScala.pf1))
  }
}
