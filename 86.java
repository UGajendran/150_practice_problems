// Given three arrays A1, A2, A3. Find the count of the distinct values: A1 values
// should not present in both A2 and A3. Similarly for A2 and A3
// Input:[1, 2, 3, 4]
// [3, 4, 5, 6]
// [6, 7, 8]
// Output 5
import java.util.*;

public class UniqueAcrossThreeArrays {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int[] A2 = {3, 4, 5, 6};
        int[] A3 = {6, 7, 8};

        Map<Integer, Set<Integer>> map = new HashMap<>();

        addToMap(map, A1, 1);
        addToMap(map, A2, 2);
        addToMap(map, A3, 3);

        int count = 0;
        List<Integer> distinct = new ArrayList<>();

        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                count++;
                distinct.add(entry.getKey());
            }
        }

        System.out.println(count);
        System.out.println("Distinct values : " + distinct);
    }

    private static void addToMap(Map<Integer, Set<Integer>> map, int[] arr, int arrayNum) {
        for (int num : arr) {
            map.computeIfAbsent(num, k -> new HashSet<>()).add(arrayNum);
        }
    }
}
