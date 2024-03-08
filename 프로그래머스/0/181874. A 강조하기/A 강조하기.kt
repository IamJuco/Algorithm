class Solution {
    fun solution(myString: String): String {
        var answer: String = ""

        for (i in 0.. myString.length-1){
                answer += myString[i].lowercase()
        }
        answer = answer.replace("a","A")
        return answer
    }
}