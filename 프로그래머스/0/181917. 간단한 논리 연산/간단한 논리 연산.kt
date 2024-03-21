class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        var answer: Boolean = true
        var value1: Boolean
        var value2: Boolean

        if (x1 || x2) {
            value1 = true
        } else {
            value1 = false
        }

        if (x3 || x4) {
            value2 = true
        } else {
            value2 = false
        }

        if (!value1 || !value2){
            answer = false
        } else {
            answer = true
        }

        return answer
    }
}