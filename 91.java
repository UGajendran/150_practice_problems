// Given an array arr[], the task is to find the subarray that has the maximum sum and
// return its sum.
// Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
// Output: 11
class max{
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
    //Kadane's Algorithm
}