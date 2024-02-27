class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        if (k % 2 != 0){
            for (i in 0.. arr.size-1){
                arr[i] *= k
            }
        }else
            for (i in 0..arr.size-1) {
                arr[i] += k
            }
        return arr
    }
}