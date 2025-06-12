// Print braces pattern program
// int n=2
// Output:
// { }
// { } {{ }}
class Main{
    public static void main(String[] args){
        int n = 3;
        String s = "";
        for(int i = 1; i <= n; i++){
                s += rec(i);
                System.out.println(s);
            }
        }
    private static String rec(int n){
        if(n == 1){
            return "{ }";
        }
        return "{" + rec(n - 1) + "}";
    }
}