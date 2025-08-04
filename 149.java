// Given an integer array of size N. Write Program to find sum of positive square
// elements in the array.
// Sample input 1:
// 4
// 1 2 3 4
// Sample output 1:
// 30
// Explanation :
// (1 + 4 + 9 + 16) = 30
// Sample input 2:
// 4
// -1 -2 -3 -4
// Sample output 2:
// 30
// Explanation:
// (1 + 4 + 9 + 16) = 30
class Main{
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4};
        int op = 0;
        for(int num: arr){
            int sq = num * num;
            op += sq;
        }
        System.out.println(op);
    }
}