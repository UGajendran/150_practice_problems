//  Insert an element in an array
// Input: arr[] = [10, 20, 30, 40], pos = 3, ele = 50
// Output: [10, 20, 50,30, 40]
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        int pos = 3;
        pos = pos - 1;
        int ele = 50;
        int[] op = new int[arr.length + 1];
        int j = 0;
        for(int i = 0; i < op.length; i++){
            if(i == pos){
                op[i] = ele;
            }
            else{
                op[i] = arr[j++];
            }
        }
        System.out.println(Arrays.toString(op));
    }
}