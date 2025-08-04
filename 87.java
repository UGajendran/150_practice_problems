// Given an array of integers greater than zero, find if it is possible to split it in two
// subarrays (without reordering the elements), such that the sum of the two
// subarrays is the same. Print the two subarrays.
// Input: Arr[] = { 1 , 2 , 3 , 4 , 5 , 5 }
// Output: { 1 2 3 4 }
// { 5 , 5 }
import java.util.*;

public class SplitArrayEqualSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        splitArray(arr);
    }

    static void splitArray(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                System.out.print("{ ");
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println("}");

                System.out.print("{ ");
                for (int j = i + 1; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println("}");
                return;
            }
        }

        System.out.println("Not possible to split into two subarrays with equal sum.");
    }
}
