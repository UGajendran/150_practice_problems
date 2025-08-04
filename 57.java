// Second largest number in an array
// Input:[12, 35, 1, 10, 34, 1]
// Output:34
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {12, 35, 1, 10, 34, 1};
        int max =Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}