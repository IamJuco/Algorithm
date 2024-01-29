class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val char = my_string.toCharArray()
        
        for (i in overwrite_string.indices){
            char[i+s] = overwrite_string[i]
        }
      
        return char.joinToString ("")
    } 
}