object Solution {
  def numDecodings(s: String): Int = {
    def loop(chars: List[Char]) : Int = {
      chars match {
        case x :: Nil => 1
        case x :: y :: xs =>
          val consumeOne = if(x != 0) loop(y :: xs) else 0
          val consumeTwo = if(x == 1 || (x == 2 && y < 7)) loop(xs) else 0
          consumeOne + consumeTwo
      }
    }
    if(s.length == 0) 0 else loop(s.toList)
  }
  }
