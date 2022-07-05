object Solution {
 def maxPower(s: String): Int = {
       val res = s.foldLeft((0,0,Char.MaxValue)){
          case ((prevCounter, currCounter, prevValue), currValue) => {
            if(currValue != prevValue) {
              (Math.max(prevCounter, currCounter), 1, currValue)
            }
            else{
              (prevCounter, currCounter + 1, currValue)
            }
          }
        }
        Math.max(res._1, res._2)

  }  
}
