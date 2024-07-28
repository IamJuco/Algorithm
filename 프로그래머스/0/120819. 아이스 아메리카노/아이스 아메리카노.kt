class Solution {
    fun solution(money: Int): IntArray {
        var answer = IntArray(2)
        val americano = 5500
        answer[0] = money / americano
        answer[1] = money % americano
        return answer
    }
}