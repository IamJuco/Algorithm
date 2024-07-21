class Solution {
    fun solution(array: IntArray): IntArray {
        var answer = IntArray(2)
        var temp: IntArray
        var count = 0

        temp = array.sortedArray()
        answer[0] = temp[array.size - 1]
        for (i in 0.. array.size -1) {
            count++
            if (answer[0] == array[i]) {
                answer[1] = count - 1
                break
            }
        }
        return answer
    }
}