class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0


        for (i in 0.. order.size-1){
            if (order[i].contains("americano")){
                answer += 4500
            } else if (order[i].contains("cafelatte")){
                answer += 5000
            } else {
                answer += 4500
            }
        }
        return answer
    }
}