// Re-arranged array by small – largest combination
// Input: [1, 3, 5, 2, 8, 7, 4]
// Output:[1, 8, 2, 7, 3, 5, 4]
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1,3,5,2,8,7,4};
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            if(left == right){
                res.add(arr[left]);
            }
            else{
                res.add(arr[left]);
                res.add(arr[right]);
            }
            left++;
            right--;
        }
        System.out.println(res);
    }
}