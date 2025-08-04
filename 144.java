// Find the Key:
// input1=3521, input2=2452, input3=1352
// Key= Smallest number from input1+ Smallest number from input2+ Smallest
// number from input3+ largest number from input1+ largest number from input2+
// largest number from input3
// Key=1+2+1+5+5+5=19
import java.util.*;
class Main{
    public static void main(String[] args){
        int n1=3521, n2=2452, n3=1352;
        int[] inputs = {n1, n2, n3};
        int key = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int num: inputs){
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            while(num > 0){
            int rem = num % 10;
            max = Math.max(max, rem);
            min = Math.min(min, rem);
            num = num / 10;
            }
         key += max + min;
        }
        System.out.println(key);
    }
}