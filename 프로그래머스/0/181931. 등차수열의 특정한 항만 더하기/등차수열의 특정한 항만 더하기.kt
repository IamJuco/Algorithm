class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var arr = IntArray(included.size)

        // a = 1항
        // a + d = 2항
        // (a + d) + d = 3항
        // (a + d) + d + d = 4항

        arr[0] = a

        for (i in 1..included.size-1){
            arr[i] = arr[i - 1] + d
        }

        for (i in 0..included.size-1){
            if (included[i]){
                answer += arr[i]
            }
        }

        return answer
    }
}