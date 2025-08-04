// Given an array of integers nums and an integer target, return indices of the two
// numbers such that they add up to target.
// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: 3 4
// Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(Arrays.toString(Two(arr, target)));
    }
    private static int[] Two(int[] arr, int target){
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int rem = target - arr[i];
            if(m.containsKey(rem)){
                return new int[] {m.get(rem), i};
            }
            m.put(arr[i], i);
        }
        return new int[]{};
    }
}