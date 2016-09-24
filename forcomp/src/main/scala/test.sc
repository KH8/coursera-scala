import forcomp.Anagrams._

val sentence = List("Linux", "rulez")
val sentence2 = List("Rex", "Lin", "Zulu")
val sentence3 = List("Rex", "Lin", "Zul")

def sum(s: Sentence): Int = s.map(_.length).sum

sum(sentence).equals(sum(sentence2))
sum(sentence).equals(sum(sentence3))

val anagrams = List(List("Linux", "rulez"), List("rulez", "Linux1"))
anagrams.filter((s) => sum(s).equals(sum(sentence)))

val anagrams2 = getSetOfSentencesByOccurrences(sentenceOccurrences(sentence))
anagrams2.filter((s) => {
  val sum1 = sum(s)
  val sum2 = sum(sentence)
  sum1.equals(sum2)
})

sum(List("nu", "Liz", "Rex"))