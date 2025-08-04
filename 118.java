// First Repeated character in a string
// Input : ababa
// Output : a //in the 2nd index
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "ababa";
        System.out.println(help(s));
    }
    private static char help(String s){
        Map<Character, Integer> h = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(h.get(c) == null){
                h.put(c, h.getOrDefault(c, 0) + 1);
            }
            else{
                return c;
            }
        }
        return '\0';
    }
}