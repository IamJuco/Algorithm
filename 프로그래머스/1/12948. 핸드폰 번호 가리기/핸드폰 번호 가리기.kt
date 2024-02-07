class Solution {
    fun solution(phone_number: String): String {
        var answer = phone_number.toMutableList()
        for (i in 0..answer.size-5){
            answer.set(i,'*')
        }

        return answer.joinToString ("")
    }
}