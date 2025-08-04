// Given an integer array using searching element place the incremented number
// next to searching number
// Input = {10,20,10,30,14,40,60,10}
// Search=10
// Output={10,1,20,10,2,30,14,40,60,10,3}
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 10, 20, 14,30, 40, 60, 10};
        int n = 10;
        System.out.println(Arrays.toString(call(arr, n)));

    }
    private static int[] call(int[] arr, int n){
        int c  = 0;
        for(int num: arr){
            if(num == n){
                c++;
            }
        }
        int[] op = new int[c + arr.length];
        int j = 0;
        int k = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                 op[j++] = arr[i];
                 op[j++] = k++;
            }
            else{
                 op[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(op));
        return op;
    }
}
