// Program to print the frequency count from highest to lowest
// I/p: “repeatable”
// O/p: e:3
// a:2
// r:1
// p:1
// t:1
// b:1
// l:1
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "repeatable";
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> sorted = new ArrayList<>(m.entrySet());
        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for(Map.Entry<Character, Integer> entry: sorted){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}