//This is a scala comment
/* This is another one */

class Upper {
  def upper(strings:String*):Seq[String] = {
    strings.map((s:String) => s.toUpperCase())
  }
}

val up = new Upper
val s = "Hello World!"
println(up.upper("Hello world!"))
println(up.upper(s))
println(up.upper("This", "is", "test"))

s.contains("w")
s.contains("W")

1+2
2+4

