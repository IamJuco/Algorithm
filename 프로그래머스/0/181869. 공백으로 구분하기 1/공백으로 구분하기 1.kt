class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        my_string.split(" ").map {
            answer += it
        }

        return answer
    }
}