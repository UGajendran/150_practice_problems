// You’re given the size of the array and an array of integers; print the number
// of times each integer has occurred in the array.
// Sample Input 1: 10
// 1 2 3 3 4 1 4 5 1 2
// Sample Output 1:
// 1 occurs 3 times
// 2 occurs 2 times
// 3 occurs 2 times
// 4 occurs 2 times
// 5 occurs 1 times
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 3, 4, 1, 4, 5, 1, 2};
        LinkedHashMap<Integer, Integer> h = new LinkedHashMap<>();
        for(int num: arr){
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: h.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            System.out.println(key + " occurs " + val + " times");
        }
    }
}