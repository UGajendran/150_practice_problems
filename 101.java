// Highest frequency character in aString
// Input: engineering
// Output: e 3
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "engineering";
        s.toLowerCase();
        Map<Character, Integer> s1 = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            s1.put(c, s1.getOrDefault(c, 0) + 1);
        }
         int max = Collections.max(s1.values());
        System.out.println(max);
        for (Map.Entry<Character, Integer> entry : s1.entrySet()) {
            if(entry.getValue()== max){     
        System.out.println(entry.getKey() + " " + max);
        break;
            }
        }
    }
}