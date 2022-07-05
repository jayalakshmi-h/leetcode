object Solution {
    def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
        nums.foldLeft(Array.empty[Int])((acc, rec) => {
       val res = nums.filter(_ < rec)
       acc :+ res.length}
       )
    }
}
