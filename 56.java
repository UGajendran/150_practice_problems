// Missing number in an array of shuffled order
// Input:[3, 7, 1, 2, 8, 4, 5]
// Output:6
class Main{
    public static void main(String[] args){
        int[] arr = {3, 7, 1, 2, 8, 4, 5};
        int sum2 = ((arr.length + 1) * (arr.length + 2))/2;
        int sum1 = 0;
        for(int i = 0; i < arr.length; i++){
            sum1 += arr[i];
        }
        int op = Math.abs(sum2 - sum1);
        System.out.println(op);
    }
}