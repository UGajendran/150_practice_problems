// Find second smallest element in an array
// Given an array of N integers and we have to find its second minimum/smallest
// element using Java program.
// Input:
// Enter number of elements: 4
// Input elements: 45, 25, 69, 40
// Output:
// Second smallest element in: 40
class Main{
    public static void main(String args[]){
        int[] arr = {45, 25, 69, 40};
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int num: arr){
            if(num < min1){
                min2 = min1;
                min1 = num;
            }
            else if(num < min2 && num > min1){
                min2 = num;
            }
        }
        System.out.println("Second smallest element is: " + min2);
    }
}