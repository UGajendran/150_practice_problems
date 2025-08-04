// Program to encrypt the given string
// input="aaabccccddaaaaab"
// output=a3bc4d2a5b
public class Encrypt{
    public static void main(String[] args){
        String s = "aaabccccddaaaaab";
        int n = 1;
        String op = "";
        for(int i = 0; i < s.length() - 1; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if(c1 == c2){
                n += 1;
            }
            else{
                op += c1;
                if(n > 1){
                    op += n;
                }
                n = 1;
            }
        }
        op += s.charAt(s.length() - 1);
        if(n > 1){
            op += n;
        }
        System.out.println(op);
    }
}