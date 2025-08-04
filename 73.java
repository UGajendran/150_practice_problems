// Finding Frequency of Duplicate elements in an array
// Input : arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
// Output : 10 3
// 20 4
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        // list.sort((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}