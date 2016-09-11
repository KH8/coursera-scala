import patmat.Huffman._

def times(chars: List[Char]): List[(Char, Int)] = {
  if (chars.isEmpty) List()
  else (chars.head, 1) :: times(chars.tail)
}

val string = "hehhebbc"
val t1 = times(string2Chars(string))
val t2 = t1.groupBy(_._1).mapValues(_.map(_._2).sum).toList

t2.sortBy(_._2)(new Ordering[Int] {
  override def compare(x: Int, y: Int): Bit = x.compareTo(y)
})

val l1 = makeOrderedLeafList(t2)

combine(l1)

def until(singleton: List[CodeTree] => Boolean, combine: List[CodeTree] => List[CodeTree])(trees: List[CodeTree]): CodeTree = {
  if (singleton(trees)) trees.head
  else until(singleton, combine)(combine(trees))
}

val l2 = List(Leaf('e',1), Leaf('t',2), Leaf('x',3))
until(singleton, combine)(l2)

createCodeTree(string2Chars("xtetxx"))