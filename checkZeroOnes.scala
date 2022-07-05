object Solution {
    def checkZeroOnes(s: String): Boolean = {
          s.split("0").map(_.length).:+(0).max > s.split("1").map(_.length).:+(0).max
    }
}
