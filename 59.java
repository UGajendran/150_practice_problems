// Remove all duplicates in an array sample input and output
// Input:[1, 2, 2, 3, 4, 4, 5]
// Output:[1, 2, 3, 4, 5]
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5};
        LinkedHashSet<Integer> dup = new LinkedHashSet<>();
        for(int num:arr){
            dup.add(num);
        }
        int[] op = new int[dup.size()];
        int i = 0;
        for(int num: dup){
            op[i++] = num;
        }
        System.out.println(Arrays.toString(op));
    }
}
//May use HashSet also but it doesnt preserve order