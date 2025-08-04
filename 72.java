// Reverse an Array
// Input: arr = [4, 5, 2]
// Output: [2, 5, 4]
// Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
import java.util.Arrays;
class Rev{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int left = 0;
        int right = arr.length - 1;
        while(left != right && left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}