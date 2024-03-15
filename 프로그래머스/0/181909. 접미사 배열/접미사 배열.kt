class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        answer = my_string.indices.map {
            my_string.substring(it)
        }.sorted().toTypedArray()

        return answer
    }
}