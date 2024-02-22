import kotlin.math.*

class Solution {
    fun solution(n: Int, m: Int): IntArray {                
        
              
        var max = max(n, m)
        var min = min(n, m)
    
        while(min > 0){
            
            // 작은 수(나누는 수)의 임시 변수
            var temp = min
            
            // 나머지가 나누는 수가 된다.
            min = max % min
            
            // 작은수가 큰 수가 된다.
            max = temp                        
        }
               
                
        return intArrayOf(max, n*m/max)
    }
}