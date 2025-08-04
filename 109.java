// Program to check the strings are anagram
// "dogo"
// "godo"
// Output: true
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        String s1 = "silent";
        String s2 = "tensil";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2));
    }
}