class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (i in 0.. strArr.size-1){
            if (i % 2 != 0){
                answer += strArr[i].uppercase()
            } else {
                answer += strArr[i].lowercase()
            }
        }

        return answer
    }
}