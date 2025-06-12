import java.util.Scanner;
class S25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 99){
            n = reduced(n);
        }
        System.out.println(n);
    }
    private static int reduced(int n){
        int result = 0;
        int pd = -1;
        int fact = 1;
        while(n > 0){
        int cd = n % 10;
        if(pd != -1){
            int diff = Math.abs(cd - pd);
            result += diff * fact;
            fact *= 10;
        }
        pd = cd;
        n /= 10;
        }
        return result;
    }
}