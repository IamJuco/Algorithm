class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer = IntArray(numbers.size)

        if (direction == "right") {
            answer[0] = numbers[numbers.size - 1]
            for (i in 1..numbers.size - 1) {
                answer[i] = numbers[i - 1]
            }
        } else {
            answer[numbers.size - 1] = numbers[0]
            for (i in 0 until numbers.size - 1) {
                answer[i] = numbers[i + 1]
            }
        }

        return answer
    }
}