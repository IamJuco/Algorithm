class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        val intList = ArrayList<Int>()
        for (i in intervals.indices) {
            for (j in intervals[i][0]..intervals[i][1]) {
                intList.add(arr[j])
            }
        }
        return intList.stream().mapToInt { x: Int? -> x!! }.toArray()
    }
}