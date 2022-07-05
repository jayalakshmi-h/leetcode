object Solution {
    def hasAlternatingBits(n: Int): Boolean = {
          val res = n ^ (n >> 1)
         (res & (res + 1)) == 0
    }
}
