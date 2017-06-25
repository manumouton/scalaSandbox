package programmingScala.principles

/**
  * Created by manumouton on 08/05/2017.
  */
class StringUtils {

  def joiner(strings:String*) = strings.mkString("#")

  //Need a result type otherwise won't compile
  def joiner(strings:List[String]):String = joiner(strings : _*)
}
