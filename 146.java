// Find second largest element in an array
// Given an array of N integers and we have to find its second largest element using
// Java program.
// Input:
// Enter number of elements: 4
// Input elements: 45, 25, 69, 40
// Output:
// Second largest element in: 45
class Main{
    public static void main(String args[]){
        int[] arr = {45, 25, 69, 40};
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if(num > max2 && num < max1){
                max2 = num;
            }
        }
        System.out.println("Second largest element is: " + max2);
    }
}