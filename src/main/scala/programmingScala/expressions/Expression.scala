package programmingScala.expressions

trait Expr {
  def isNumber: Boolean

  def isSum: Boolean

  def numValue: Int

  def leftOp: Expr

  def rightOp: Expr

  def eval(e: Expr): Int = {
    if(e.isNumber) e.numValue
    else if(e.isSum) eval(e.leftOp) + eval(e.rightOp)
    else throw new Error("Unsupported type")
  }
}

class Number(n: Int) extends Expr {
  override def isNumber = true

  override def isSum = false

  override def numValue = n

  override def leftOp = throw new Error("Number.leftOp")

  override def rightOp = throw new Error("Number.rightOp")
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  override def isNumber = false

  override def isSum = true

  override def numValue = throw new Error("Sum.numValue")

  override def leftOp = e1

  override def rightOp = e2
}
