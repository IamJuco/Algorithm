class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0
        var temp:Int
        var num = n

        while (num >= a){
            answer += num / a * b
            temp = num % a
            temp += num / a * b
            num = temp
        }
        return answer
    }
}