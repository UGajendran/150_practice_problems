// Find the Key:
// You are provided with 3 numbers: input1, input2 and input3. Each of these
// are 4 digits’ numbers within >=1000 and <=9999 i.e., 1000<=input1<=9999
// 1000<=input2<=9999 1000<=input3<=9999 You are expected to find the key using
// below formula:
// Key = Sum of Largest digits of each number + Sum of Second Largest digits of each
// number for Example, input1=3521, input2=2452 input3=1352
// Key = (5+5+5) + (3+4+3) = 25
import java.util.*;
class Main{
    public static void main(String[] args){
        int n1=3521, n2=2452, n3=1352;
        int key = 0;
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        while(n1 > 0){
            int rem = n1 % 10;
            if(rem > max){
                max2 = max;
                max = rem;
            }
            else if(rem > max2 && rem < max){
                max2 = rem;
            }
            n1 = n1 / 10;
        }
        key += max + max2;
        max = Integer.MIN_VALUE;
        while(n2 > 0){
            int rem = n2 % 10;
            if(rem > max){
                max2 = max;
                max = rem;
            }
            else if(rem > max2 && rem < max){
                max2 = rem;
            }
            n2 = n2 / 10;
        }
        key += max + max2;
        max = Integer.MIN_VALUE;
        while(n3 > 0){
            int rem = n3 % 10;
            if(rem > max){
                max2 = max;
                max = rem;
            }
            else if(rem > max2 && rem < max){
                max2 = rem;
            }
            n3 = n3 / 10;
        }
        key += max + max2;
        System.out.println(key);
    }
}