class Solution {
    fun solution(n: Int, control: String): Int {
        var answer = n
        for (i in control.indices){
            if (control[i].equals('w')){
                answer += 1
            } else if (control[i].equals('s')){
                answer -= 1
            } else if (control[i].equals('d')){
                answer += 10
            } else if (control[i].equals('a')){
                answer -= 10
            }
        }
        return answer
    }
}