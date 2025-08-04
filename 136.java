// Write a method to find the number of longest increasing subsequences(LIS)
// found in the given array and return the same.
// • Longest Increasing Subsequence (LIS) finds the longest subsequence where
// elements strictly increase in order.
// • The LIS problem involves finding the longest subsequence of a sequence where
// each element is greater than the previous one, preserving order.
// int countOfLIS (int data []) {
// //write code }
// Sample Input 1: 1 1 2 3 3 4 1 4 5 1 2
// Sample Output 1: Number of longest increasing subsequences = 3
// (Sub sequence 1: 1 1 2 3 3 4, sub sequence 2: 1 4 5, Sub sequence 3: 1 2)
class Main{
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 3, 3, 4, 1, 4, 5, 1, 2};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int cur = arr[i];
            int curm = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > cur && arr[j] != cur){
                    cur = arr[j];
                    curm++;
                }
                else{
                    break;
                }
            }
          max = Math.max(curm, max);
        }
        System.out.println(max);
    }
}