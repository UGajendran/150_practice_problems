// Program to process the string with unique characters count within the
// distance
// Input1=="my name is granar";
// Input2='a';
// Output=7
import java.util.*;
class Main{
    public static void main(String[] args){
        String s = "my name is granar";
        String ip2 = "a";
        int left = 0;
        int right = s.length();
        for(int i = 0; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals(ip2)){
                left = i + 1;
                break;
            }
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(String.valueOf(s.charAt(i)).equals(ip2)){
                right = i;
                break;
            }
        }
        String sub = s.substring(left, right);
        HashSet<Character> h = new HashSet<>();
        for(int i = 0; i < sub.length(); i++){
            char c = sub.charAt(i);
            if(!String.valueOf(c).equals(ip2) && Character.isLetter(c)){
                h.add(c);
            }
        }
        System.out.println(h.size());
    }
}