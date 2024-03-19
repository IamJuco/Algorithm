import java.time.LocalDate

class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer: Int = 0

        val date1 = LocalDate.of(date1[0], date1[1], date1[2])
        val date2 = LocalDate.of(date2[0], date2[1], date2[2])
        val compare = date1.compareTo(date2)
        if (compare < 0){
            answer = 1
        } else {
            answer = 0
        }

        return answer
    }
}