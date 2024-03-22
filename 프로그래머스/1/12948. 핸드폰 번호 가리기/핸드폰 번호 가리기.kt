class Solution {
    fun solution(phone_number: String): String {
        var temp = ""
        var answer = ""

        for (i in 0..phone_number.length-5){
            temp = phone_number.replace(phone_number[i],'*')
            answer += temp[i]
        }

        for (i in phone_number.length-4..phone_number.length-1){
            answer += phone_number[i]
        }


        return answer
    }
}