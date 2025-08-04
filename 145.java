// Remove duplicate elements from an array
// Given an array of integers, we have to remove duplicate elements using a java
// program.
// Input array elements:
// 1, 2, 3, 1, 2, 3, 4
// Output:
// Elements after removing duplicates
// 1, 2, 3, 4
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] input = {1, 2, 3, 1, 2, 3, 4};
        Set<Integer> a = new HashSet<>();
        for(int num: input){
            a.add(num);
        }
        int[] res = new int[a.size()];
        int pos = 0;
        for(int ele: a){
            res[pos++] = ele;
        }
        System.out.println(Arrays.toString(res));
    }
}