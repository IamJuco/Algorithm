class Solution {
    fun solution(new_id: String): String {
        var answer: String = ""
        val rules = ('a'..'z') + ('0'..'9') + listOf('-', '_', '.')
        
        answer = new_id.lowercase().filter { it in rules }
        
        var result = ""
        var isDot = false
        
        for(char in answer) {
            if(char == '.') {
                if(!isDot) {
                    result += char
                    isDot = true
                }
                
            } else {
                result += char
                isDot = false
            }
        }
        
        if (result.startsWith(".")) result = result.drop(1)
        if (result.endsWith(".")) result = result.dropLast(1)
        
        if(result.isEmpty()) result = "a"
        
        if(result.length >= 16) result = result.take(15)
        if(result.last() == '.') result = result.dropLast(1)
        
        if(result.length <= 2) {
            val last = result.last()
            while(result.length < 3) {
                result += last
            }
        }
    
        return result
    }
}