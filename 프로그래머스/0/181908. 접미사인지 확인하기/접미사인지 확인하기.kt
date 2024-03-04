class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0

        if (my_string.endsWith(is_suffix)){
            answer = 1
        }

        return answer
    }
}