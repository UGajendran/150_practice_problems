import java.util.*;

public class FrequencyDescending {
    public static void main(String[] args) {
        int[] a = {50, 20, 150, 20, 50, 10, 30, 10, 10};

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((e1, e2) -> {
            if (!e1.getValue().equals(e2.getValue())) {
                return e2.getValue() - e1.getValue(); 
            } else {
                return e2.getKey() - e1.getKey(); 
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
