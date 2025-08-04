// Delete an element from an array
// Input: arr[] = [10, 20, 30, 40], pos = 2
// Output: [10, 30, 40]
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        int pos = 2;
        pos = pos - 1;
        int[] op = new int[arr.length - 1];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != pos){
                op[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(op));
    }
}