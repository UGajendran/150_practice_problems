// decrypt the given string
// Input:Encrypted string: khoor
// Output:Decrypted string: hello
class Main{
    public static void main(String[] args){
        String s = "khoor";
        System.out.println(help(s));
    }
    private static String help(String s){
        String op = "";
        char base = 'a';//if all are Lowercase
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = (char) ((c - base - 3 + 26) % 26 + base);
            op += String.valueOf(d);
        }
        return op;
    }
}