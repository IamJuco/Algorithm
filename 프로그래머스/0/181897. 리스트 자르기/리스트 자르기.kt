class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var temp: IntArray = intArrayOf()

        when(n){
            1 -> {
                answer += num_list.slice(0..slicer[1])
            }
            2 -> {
                answer += num_list.slice(slicer[0]..num_list.size-1)
            }
            3 -> {
                answer += num_list.slice(slicer[0]..slicer[1])
            }
            else -> {
                answer += num_list.slice(slicer[0]..slicer[1])
                for (i in 0..answer.size-1 step slicer[2]){
                    temp += answer[i]
                }
                answer = temp
            }
        }

        return answer
    }
}