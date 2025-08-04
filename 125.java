// print the highest frequency followed by lowest
// Input:programming
// Output:Highest frequency characters: r g m
// Lowest frequency characters: p o a i n
import java.util.*;
 class Main{
    public static void main(String[] args){
        String s = "programming";
        LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry: h.entrySet()){
            Integer cur = entry.getValue();
            min = Math.min(min, cur);
            max = Math.max(max, cur);
        }
        System.out.print("Highest Frequency Characters: ");
        for(Map.Entry<Character, Integer> entry: h.entrySet()){
            if(entry.getValue() == max){
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
        System.out.print("Lowest Frequency Characters: ");
        for(Map.Entry<Character, Integer> entry: h.entrySet()){
            if(entry.getValue() == min){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
 }