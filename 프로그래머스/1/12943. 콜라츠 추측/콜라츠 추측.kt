class Solution {
    // 500번 반복할 때까지 1이 되지 않는다면 -1을 반환
    fun solution(num: Int): Int {
        var answer = 0
        var value = num
        
        while(true){
            if(value == 1){
                break
            } else if(answer == 500){
                answer = -1
                break
            } else {
                answer++
                if(value % 2 == 0){
                    value = value / 2
                } else{
                    var temp = value.toDouble()
                    temp = temp * 3 + 1
                    value = temp.toInt()
                }
            }
        }
        
        
        return answer
    }
}