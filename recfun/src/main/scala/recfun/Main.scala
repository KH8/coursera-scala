package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == 0 || r == c) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    count(0, chars) == 0
  }

  def count(acc: Int, chars: List[Char]): Int = {
    if (acc < 0) acc else {
      if (chars.isEmpty) acc else {
        count(acc + compare(chars.head), chars.tail)
      }
    }
  }

  def compare(char: Char): Int = {
    if (char == '(') 1 else
      if (char == ')') -1 else 0
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    countChangeFromSortedList(money, coins.sorted)
  }

  def countChangeFromSortedList(money: Int, coins: List[Int]): Int = {
    if (money <= 0 || coins.isEmpty) 0 else {
      val rest = money - coins.head
      if (rest == 0) 1 else
        countChangeFromSortedList(rest, coins) + countChangeFromSortedList(money, coins.tail)
    }
  }
}
