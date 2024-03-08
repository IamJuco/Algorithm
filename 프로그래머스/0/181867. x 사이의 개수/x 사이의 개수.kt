class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()

        myString.split("x").forEach {
            answer += it.length
        }

        return answer
    }
}