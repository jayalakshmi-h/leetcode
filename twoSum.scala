object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
          nums.zipWithIndex.foldLeft((Map.empty[Int, Int], Array.empty[Int])){
     case ((map, res), (value, idx)) => {
       map.get(value) match {
         case Some(i) =>  (Map.empty, res ++ Array(i, idx))
         case None => (map ++  Map((target - value) -> idx), res)
       }

     }
   }._2
        
    }
}
