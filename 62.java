// Program to find the frequency count of every number in an array
// Input={40,20,10,50,20,10,30,40}
// Output:
// 40 -> 2
// 20 -> 2
// 10 -> 2
// 50 -> 1
// 30 -> 1
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {40, 20, 10, 50, 20, 10, 30, 40};

        Map<Integer, Integer> freqMap = new LinkedHashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
