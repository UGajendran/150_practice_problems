// Given an array of integers, return a new array such that each element at index i of
// the new array is the product of all the numbers in the original array except the one
// at i.
// For example, if our input was [1, 2, 3, 4, 5], the expected output would be
// [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6]
import java.util.*;
class Main{
    public static void main(String[] args){
       
        int[] arr = {4,2,3};
         int n = arr.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] res = new int[n];
        pre[0] = 1;
        for(int i = 1; i < n; i++){
            pre[i] = pre[i - 1] * arr[i-1];
        }
        suf[n - 1] = 1;
        for(int j = n - 2; j >= 0; j--){
            suf[j] = suf[j + 1] * arr[j + 1];
        }
        for(int i = 0; i < n; i++){
            res[i] = pre[i] * suf[i];
        }
        System.out.println(Arrays.toString(res));
    }
}