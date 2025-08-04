// Program to find the matching string and print it in Capitalcase
// inp1="fi_er";
// inp2="Fever:Filer:Filter:FIxer:Fiber:Fibre:Tailor:Offer";
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "fi_er";
        String s1 = "Fever:Filer:Filter:FIxer:Fiber:Fibre:Tailor:Offer";
        String pattern = s.toLowerCase().replace("_", ".");
        String[] arr = s1.split(":");
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].toLowerCase();
            if(arr[i].length() != s.length()){
                continue;
            }
            if(arr[i].matches(pattern)){
                String cap = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
                System.out.println(cap);
            }
        }
    }
}