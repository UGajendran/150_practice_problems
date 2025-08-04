// Find the matching string and print it in Capitalcase
// Input:"apple banana mango apple grape"
// Matching word: "apple"
// Output:"Apple banana mango Apple grape"
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "apple banana mango apple grape";
        String op = "";
        String s2 = "apple";
        String arr[] = s.split("\\s+");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(s2)){
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                op += arr[i] + " ";
            }
            else{
                op += arr[i] + " ";
            }
        }
        System.out.println(op.trim());
    }
}