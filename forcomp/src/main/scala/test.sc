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