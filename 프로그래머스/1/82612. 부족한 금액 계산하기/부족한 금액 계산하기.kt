class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        var totalPrice: Long = 0
        for (i in 1..count){
            totalPrice = totalPrice + price * i
        }
        answer = totalPrice - money

        if (money >= totalPrice){
            answer = 0
        }
        return answer
    }
}