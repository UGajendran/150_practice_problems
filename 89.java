// You are given an array arr, and your task is to find the majority element an element
// that occurs more than half the length of the array (i.e., arr.size() / 2). If such an
// element exists return it, otherwise return -1, indicating that no majority element is
// present.
// Input : arr[] = [1, 1, 2, 1, 3, 5, 1]
// Output : 1
import java.util.*;

public class MajorityElementFinder {
    public static int findMajority(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(findMajority(arr));
    }
}
