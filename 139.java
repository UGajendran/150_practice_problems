// Find the Key:
// input1=3521, input2=2452, input3=1352
// Key= (Smallest digit in thousands Place) (Smallest digit in hundreds Place)
// (Smallest digit in tens Place) (Smallest digit in units Place)
// Key=1321
import java.util.*;
class Main{
    public static void main(String[] args){
        int input1=3521, input2=2452, input3=1352;
        int key = 0;
        int[] thous = {input1 / 1000, input2 / 1000, input3 / 1000};
        int[] hun = {(input1 / 100) % 10, (input2 / 100) % 10, (input3 / 100) % 10};
        int[] tens = {(input1 / 10) % 10, (input2 / 10) % 10, (input3 / 10) % 10};
        int[] uni = {input1 % 10, input2 % 10, input3 % 10};
        int min1 = Integer.MAX_VALUE;
        for(int num: thous){
            min1 = Math.min(num, min1);
        }
        key = (key * 10) + min1;
        min1 = Integer.MAX_VALUE;
        for(int num: hun){
            min1 = Math.min(num, min1);
        }
        key = (key * 10) + min1;
        min1 = Integer.MAX_VALUE;
        for(int num: tens){
            min1 = Math.min(num, min1);
        }
        key = (key * 10) + min1;
        min1 = Integer.MAX_VALUE;
        for(int num: uni){
            min1 = Math.min(num, min1);
        }
        key = (key * 10) + min1;
        System.out.println(key);
    }
}