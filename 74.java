// Finding frequency of Unique elements in an array
// Input : arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
// // Output : 5 1
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 6,  20};
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() == 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}