// SIMPLE ENCODED ARRAY
// Maya has stored few confidential numbers in an array (array of int). To ensure that
// others do not find the numbers easily, she has applied a simple encoding.
// Encoding used: Each array element has been substituted with a value that is the
// difference of its original value and its succeeding element’s value.
// i.e. arr[i] = arr[i+1]-arr[i]
// e.g. value in arr[0] = original value of arr[1] - original value of arr[0]
// Also note that value of last element i.e. arr[last index] remains unchanged.
// Example:If the original array is –{2, 5, 1, 7, 9, 3}
// The encoded array would be –{3, -4, 6, 2, -6, 3}
// Provided the encoded array, you are expected to find the –
// a) First number (value in index 0) in the original array
// b) Sum of all numbers in the original array The prototype of the function is:public
// static void findOriginalFirstAndSum(int[] input1,input 2);
// where input1 is the encoded array.The method is expected to –
// ● find the value of the first number of the original array and store it in the member
// output1 and
// ● find the sum of all numbers in the original array and store it in the member
// output2.
// Assumption(s):
// ● The array elements can be positive and/or negative numbers
// Example 1:Original array = {2, 5, 1, 7, 9, 3} Encoded array = {3, -4, 6, 2, -6, 3} First
// number in
// original array = 2 Sum of all numbers in original array = 27
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] enc = {3, -4, 6, 2, -6, 3};
        int[] org = findOrg(enc);
        System.out.println("First number in original array = " +  org[0]);
        int sum = 0;
        for(int num: org){
            sum += num;
        }
        System.out.println("Sum of all numbers in original array = " + sum);
    }
    private static int[] findOrg(int[] enc){
        int[] org = new int[enc.length];
        org[enc.length - 1] = enc[enc.length - 1];
        for(int i = enc.length - 2; i >= 0; i--){
            org[i] = org[i + 1] - enc[i];
        }
        return org;
    }
}