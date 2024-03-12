class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        var ascii = 'k'

        for (i in 0..myString.length-1){
            if (myString[i].toInt() <= ascii.toInt()){
                answer += 'l'
            } else {
                answer += myString[i]
            }
        }
        return answer
    }
}