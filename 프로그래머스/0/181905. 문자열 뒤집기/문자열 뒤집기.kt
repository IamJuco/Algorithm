class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var answer = ""
        var reversedString = ""
        var lastString = ""

        for (i in 0 until s) {
            answer += my_string[i]
        }

        for (i in s..e) {
            reversedString += my_string[i]
        }

        for (i in e + 1..my_string.length - 1) {
            lastString += my_string[i]
        }

        answer += reversedString.reversed() + lastString
        return answer
    }
}