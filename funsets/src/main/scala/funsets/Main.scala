package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  def s1 = singletonSet(1)
  def s2 = singletonSet(2)
  def s3 = singletonSet(3)

  println("set s1")
  printSet(s1)

  def u1 = union(s1, s2)
  println("union u1")
  printSet(u1)

  def u2 = union(u1, s3)
  println("union u2")
  printSet(u2)

  def p1(x: Int): Boolean = x > 1
  def f1 = filter(u2, p1)

  println("filtered f1")
  printSet(f1)

  def p2(x: Int): Boolean = x > 0
  println(forall(u2, p2))

  def p3(x: Int): Boolean = x == 3
  println(exists(u2, p3))

  def p4(x: Int): Int = x * x
  printSet(map(u2, p4))
}
