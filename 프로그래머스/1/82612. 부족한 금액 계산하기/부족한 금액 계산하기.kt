import kotlin.math.abs

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long
        var temp: Long = 0
        for (i in 1..count) {
            temp += (price * i).toLong()
        }
        if (temp > money) {
            answer = money - temp
            answer = abs(answer)
        } else {
            answer = 0
        }

        return answer
    }
}