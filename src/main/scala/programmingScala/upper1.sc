//This is a scala comment
/* This is another one */

class Upper {
  //strings is a variable length argument list of Strings (indicated with the *)
  def upper(strings:String*):Seq[String] = {
    strings.map((s:String) => s.toUpperCase)
  }
}

/* When defining an object, this is actually a singleton in the application. */
object Lower{
  def lower(strings:String*):Seq[String] = {
    strings.map(_.toLowerCase)
  }
}

val up = new Upper
val s = "Hello World!"
println(up.upper("Hello world!"))
println(Lower.lower("Hello world!"))
println(up.upper(s))
println(up.upper("This", "is", "test"))

s.contains("w")
s.contains("W")

1+2
2+4


