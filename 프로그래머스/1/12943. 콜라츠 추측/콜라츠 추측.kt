class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var value = num.toLong()

        while (true){
            if (value == 1L){
                break
            } else if (answer == 500){
                answer = - 1
                break
            } else{
                answer++
                if (value % 2 == 0L){
                    value /= 2
                } else {
                    value = value * 3 + 1
                }
            }
        }
        return answer
    }
}