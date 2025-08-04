// Given an integer array of size N, write a program to sort the array;
// Sample input 1:
// 4
// 2 4 1 3
// Sample output 1:
// 1 2 3 4
// Sample input 2:
// 5
// 1 5 7 5 3
// Sample output 2:
// 1 3 5 5 7
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1, 5, 7, 5, 3};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;       
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}