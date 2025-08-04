// Ranking
// Given the array of elements where you have to print the rank of every
// elements in the array without changing the position
// Input:
// {10,5,20,30,1,4,25}
// Output:
// 4, 3, 5, 7, 1, 2,6
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {10,5,20,30,1,4,25};
        int[] sorted = arr.clone();
        int[] res = new int[arr.length];
        Arrays.sort(sorted);
        LinkedHashMap<Integer, Integer> h = new LinkedHashMap<>();
        int rank = 1;
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && sorted[i] == sorted[i - 1]){
                continue;
            }
            h.put(sorted[i], rank++);
        }
        for(int i = 0; i < arr.length; i++){
            res[i] = h.get(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}