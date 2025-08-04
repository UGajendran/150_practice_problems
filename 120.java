// Given a string s of lowercase English letters, the task is to find the first nn-
// repeating character. If there is no such character, return '$'.
// Input:"aabcdd"
// Output:'b'
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "aabcdd";
        System.out.println(help(s));
    }
    private static char help(String s){
        Map<Character, Integer> h = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            String sub = s.substring(i+1);
            if(h.get(c) == null && !(sub.contains(String.valueOf(c)))){
                return c;
            }
            else{
                h.put(c, h.getOrDefault(c, 0) + 1);
            }
        }
        return '\0';
    }
}