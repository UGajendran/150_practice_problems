import java.util.*;
class Main{
    public  static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 8, 7};
        int k = 3;
        int left = 0;
        int right = k;
        ArrayList<Integer> s = new ArrayList<>();
        while(right <= arr.length){
            int min = Integer.MIN_VALUE;
            for(int i = left; i < right; i++){
                if(arr[i] > min){
                    min = arr[i];
                }
            }
            s.add(min);
            left++;
            right++;
        }
        System.out.println(s);
    }
}