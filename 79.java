// Middle Element in an array.
// Input: arr = {1, 2, 3, 4, 5}
// Output: 3
// Input: arr = {7, 8, 9, 10, 11, 12}
// Output: 9 10
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr = {7, 8, 9, 10, 11, 12};
        int n = arr.length;
        System.out.println(Arrays.toString(mid(arr, n)));
    }
    private static int[] mid(int[] arr, int n){
        if(n % 2 == 0){
            n = n /2;
            return new int[] {arr[n - 1], arr[n]};
        }
        return new int[] {arr[(n/2)]};
    }
}