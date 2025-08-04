// Longest substring without repeating characters
// Input: s = “abcdefabcbb”
// Output: 6
// Explanation: The longest substring without repeating characters is “abcdef”.
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "abcdefabcbb";
        Map<Character, Integer> h = new HashMap<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(h.get(c) != null && h.get(c) >= 1){
                continue;
            }
            else{
                h.put(c, h.getOrDefault(c, 0) + 1);
                count++;
            }
        }
        System.out.println(count);
    }
}