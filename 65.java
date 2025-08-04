// Max contiguous Subarray
// Input:[-2, 1, -3, 4, -1, 2, 1, -5, 4]
// Output:6
// Explanation:-2
// -2,1
// -2,3,-1 so on
class max{
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
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