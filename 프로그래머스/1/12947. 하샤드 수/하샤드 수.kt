class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0
        var transStr = x.toString()

        for (i in transStr.indices) {
            sum += transStr[i].toString().toInt()
        }

        if (x % sum == 0) {
            answer = true
        } else {
            answer = false
        }


        return answer
    }
}