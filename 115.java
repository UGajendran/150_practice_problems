// Longest palindrome substring
// Input: = "babad"
// Output: "bab”or "aba"
class Main{
    public static void main(String[] args){
    String s = "babad";
    System.out.println(help(s));
    }
    private static String help(String s){
    for(int i = 0; i < s.length(); i++){
        for(int j = s.length() - 1; j >= 0; j--){
            String sub = s.substring(i, j);
            if(isPal(sub)){
                return sub;
            }
        }
    }
    return "";
    }
    private static boolean isPal(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}