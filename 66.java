// Rotate an array by ‘N’ positions
// Input:[1, 2, 3, 4, 5]
// N = 2
// Output:[3, 4, 5, 1, 2]
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2; 
        rev(0, n - 1, arr);
        rev(n, arr.length - 1, arr);
        rev(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] rev(int left, int right, int[] arr){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}