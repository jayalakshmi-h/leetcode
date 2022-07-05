object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
      val res = nums.foldLeft((0,0)){
      case ((prevCounter, currCounter), currValue) => {
        if(currValue == 0) {
          (Math.max(prevCounter, currCounter), 0)
        }
        else{
          (prevCounter, currCounter + 1)
        }
      }
    }
    Math.max(res._1, res._2)
    }
}
