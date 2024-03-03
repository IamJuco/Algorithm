class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.sorted().slice(5 until num_list.size).toIntArray()
}