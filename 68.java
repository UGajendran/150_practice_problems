// Given an integer array find the duplicate element which has the longest distance
// note: Assumed -1 as output if no duplicates are found
// int arr[]={1,2,3,1,3,4,2,5,6,1};
// O/p: 1
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,1,3,4,2};
        System.out.println(call(arr));
    }
    private static int call(int[] arr){
        int max = -1;
        int res = -1;
        HashMap<Integer, Integer> fd = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(fd.containsKey(arr[i])){
                int d = i - fd.get(arr[i]);
                if(d > max){
                    max = d;
                    res = arr[i];
                }
            }
            else{
                fd.put(arr[i], i);
            }
        }
        return res;
        }
    }