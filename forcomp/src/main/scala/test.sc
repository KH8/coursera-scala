import forcomp.Anagrams._

val w = "abcd"
wordOccurrences(w)

val result = w.foldLeft(Map.empty[Char, Int]) {
  (count, c) => count + (c -> (count.getOrElse(c, 0) + 1))
}
result.toList

w.groupBy(c => c).mapValues(_.size).toList

wordOccurrences(w).sorted

dictionary.groupBy(w => wordOccurrences(w))

wordAnagrams("Married")

val occurrences = List(('a', 2), ('b', 2))
def combinations(occurrences: Occurrences): List[Occurrences] = occurrences match {
  case List() => List(Nil)
  case (c, n) :: others =>
    val tails = combinations(others)
    tails ::: (for {
      j <- tails
      i <- 1 to n
    } yield (c, i) :: j)
}

combinations(occurrences)

val sentence = List("Linux", "rulez")
val sentence2 = List("Rex", "Lin", "Zulu")
val sentence3 = List("Rex", "Lin", "Zul")
val res = sentenceAnagrams(sentence)
sentenceAnagrams(sentence).length



val anas = List(
  List("Rex", "Lin", "Zulu"),
  List("nil", "Zulu", "Rex"),
  List("Rex", "nil", "Zulu"),
  List("Zulu", "Rex", "Lin"),
  List("null", "Uzi", "Rex"),
  List("Rex", "Zulu", "Lin"),
  List("Uzi", "null", "Rex"),
  List("Rex", "null", "Uzi"),
  List("null", "Rex", "Uzi"),
  List("Lin", "Rex", "Zulu"),
  List("nil", "Rex", "Zulu"),
  List("Rex", "Uzi", "null"),
  List("Rex", "Zulu", "nil"),
  List("Zulu", "Rex", "nil"),
  List("Zulu", "Lin", "Rex"),
  List("Lin", "Zulu", "Rex"),
  List("Uzi", "Rex", "null"),
  List("Zulu", "nil", "Rex"),
  List("rulez", "Linux"),
  List("Linux", "rulez")
)


def sum(s: Sentence): Int = s.map(_.length).sum

sum(sentence).equals(sum(sentence2))
sum(sentence).equals(sum(sentence3))