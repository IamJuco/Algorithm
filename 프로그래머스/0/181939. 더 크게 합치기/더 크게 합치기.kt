class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val sum1 = (a.toString() + b).toInt()
        val sum2 = (b.toString() + a).toInt()
       
        if (sum1 > sum2){
            answer = sum1
        } else answer = sum2
        
        return answer
    }
}