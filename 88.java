//  Given an array of size N where the array elements contain values from 1 to N with
// duplicates, the task is to find the total number of subarrays that start and end with
// the same element.
// Input: A[] = {1, 2, 1, 5, 2}
// Output: 7
import java.util.*;

public class SubarraySameStartEnd {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 5, 2};
        System.out.println(countSubarrays(A));
    }

    static int countSubarrays(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int total = 0;
        for (int count : freq.values()) {
            total += (count * (count + 1)) / 2;
        }

        return total;
    }
}
