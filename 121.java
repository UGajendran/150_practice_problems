// Check Whether Two Strings Are Anagram
// Input1:listen
// Input2:silent
// Output:is anagram
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        String s1 = "silent";
        String s2 = "tensil";
        if(isA(s1, s2)){
            System.out.println("is Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
    private static boolean isA(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}