class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(x in 1..n){
            if(n % x == 1){
                answer = x
                break
            }
        }
        return answer
    }
}