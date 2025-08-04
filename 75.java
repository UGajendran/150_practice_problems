// Find distinct elements in an array
// Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
// Output: {12, 10, 9, 45, 2}
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num: arr){
            set.add(num);
        }
        int[] op = new int[set.size()];
        int i = 0;
        for(int num: set){
            op[i++] = num;
        }
        System.out.println(Arrays.toString(op));
    }
}