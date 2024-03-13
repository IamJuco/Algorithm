class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0 
        var str = binomial.split(" ")

        if (str[1] == "+"){
            answer = str[0].toInt() + str[2].toInt()
        } else if (str[1] == "-"){
            answer = str[0].toInt() - str[2].toInt()
        } else {
            answer = str[0].toInt() * str[2].toInt()
        }

        return answer
    }
}