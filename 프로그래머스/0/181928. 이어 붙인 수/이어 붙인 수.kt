class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int
        var odd: String = "" // 홀수
        var even: String = "" // 짝수

        for (i in 0 .. num_list.size -1){
            if (num_list[i] % 2 == 0){
                even += num_list[i].toString()
            } else {
                odd += num_list[i].toString()
            }
        }
        answer = even.toInt() + odd.toInt()

        return answer
    }
}