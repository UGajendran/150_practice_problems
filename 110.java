// Half of the string to lower case and remaining half to uppercase
// I/P:”helloworld”
// O/P:”helloWORLD”
class Main{
    public static void main(String[] args){
        String s = "helloworld";
        System.out.println(s.substring(0, s.length() / 2).toLowerCase() + s.substring(s.length() / 2).toUpperCase());
    }  
}