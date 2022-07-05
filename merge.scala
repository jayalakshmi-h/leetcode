object Solution {
     def merge(intervals: Array[Array[Int]]) = {
     val sortedList = intervals.toList.map(A => (A(0), A(1))).sortWith((i,j) => (i._1 < j._1))
     val res = sortedList.foldLeft(List.empty[(Int, Int)])((acc, rec) => {
       if(acc.nonEmpty && (rec._1 <=  acc.last._2)) {
         val updatedElemet = (acc.last._1, Math.max(acc.last._2,rec._2))
         acc.dropRight(1) :+ updatedElemet
       }
       else {
         acc :+ rec
       }
     })
    res.toArray.map(A => Array(A._1, A._2))
  }
}
