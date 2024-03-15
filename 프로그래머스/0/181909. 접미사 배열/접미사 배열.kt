class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (i in 0..my_string.length-1){
            answer += arrayOf(my_string.substring(i))
        }
        
        answer.sort()
        return answer
    }
}