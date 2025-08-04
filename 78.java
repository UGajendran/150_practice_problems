// Check if 2 Arrays are equal or not.
// Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
// Output: true
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b));
    }
    //Time complexity of O(n Log n)
    //Use Frequency map if input varies
}