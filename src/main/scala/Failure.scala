package failure
  
object Failure {
  // Not an ideal implicit but we have API generated code that uses all Options
  protected implicit def toOption[T](v: T): Option[T] = Option(v)
  
  def main(args: Array[String]): Unit = {
    val a: Int = 123
    val b: Option[Long] = a // Works under 2.12.6 but not with the implicit-poly-prune-2.12.x PR
    println(b)
  }
}