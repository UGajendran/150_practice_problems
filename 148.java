// Count total positives, negatives and zeros from an array
// Given an array of integers and we have to count total negatives, positives and zeros
// using java program.
// Input:
// Array elements: 20, -10, 15, 00, -85
// Output:
// Positive Numbers are: 2
// Negative Numbers are: 2
// Zeros are: 1
class Main{
    public static void main(String args[]){
        int[] arr = {20, -10, 15, 00, -85};
        int pos = 0, neg = 0, zer = 0;
        for(int num: arr){
            if(num >= 0){
                if(num == 0){
                    zer++;
                }
                else{
                    pos++;
                }
            }
            else{
                neg++;
            }
        }
        System.out.println("Positive Numbers are:" + pos);
        System.out.println("Negative Numbers are:" + neg);
        System.out.println("Zeros are:" + zer);
    }
}