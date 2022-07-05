object Solution {
      def maxArea(height: Array[Int]): Int = {
    @scala.annotation.tailrec
    def calculateMaxArea(left : Int, right: Int, result: Int) : Int = {
       if(left >= right) result
       else {
         if(height(left) < height(right))
           calculateMaxArea(left + 1, right, Math.max(result,  height(left) * (right - left)))
         else
           calculateMaxArea(left, right - 1, Math.max(result, height(right) * (right - left)))
       }

    }
    if(height.isEmpty) 0 else calculateMaxArea(0, height.length - 1, 0)
  }
}
