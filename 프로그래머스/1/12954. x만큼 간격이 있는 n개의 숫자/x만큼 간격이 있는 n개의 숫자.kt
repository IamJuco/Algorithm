class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var num = x.toLong() // 2
        var answer = LongArray(n) // 5
        for(i in 0 .. answer.size-1){
            answer[i]= num * (i + 1)
        }
        return answer
    }
}