object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
       val result = s.zipWithIndex.foldLeft((Map.empty[Char, Int], 0)) {
      case ((map, prevSize), (char, idx)) => {
        map.get(char) match {
          case Some(value) => {
            val updatedMap = map.filterNot(_._2 <= value) ++ Map(char -> idx)
            if(map.size > prevSize) {
              (updatedMap , map.size)
            }
            else (updatedMap, prevSize)
          }
          case None => (map ++ Map(char -> idx), prevSize)
        }
      }
    }

    if(result._1.size > result._2) result._1.size else result._2
    }
}
