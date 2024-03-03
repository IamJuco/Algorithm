class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = IntArray(num_list.size-5)
        answer = num_list.sorted().slice(5 ..num_list.size-1).toIntArray()
        return answer
    }
}