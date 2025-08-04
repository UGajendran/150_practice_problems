// Delete all the common elements of two string and concatenate both
// a="aaaab"
// b="aabbbb"
// output:"bbbb"
import java.util.*;
class Main{
    public static void main(String[] args){
        String a = "aaaa";
        String b = "aabbbb";
        System.out.println(process(a, b));
    }
    private static String process(String s1, String s2){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char ch: s1.toCharArray()) set1.add(ch);
        for(char ch: s2.toCharArray()) set2.add(ch);
        Set<Character> common = new HashSet<>(set1);
        common.retainAll(set2);
        StringBuilder res = new StringBuilder();
        for(char ch: s1.toCharArray()){
            if(!common.contains(ch)){
                res.append(ch);
            }
        }
        for(char ch: s2.toCharArray()){
            if(!common.contains(ch)){
                res.append(ch);
            }
        }
        return res.toString();
    }
}