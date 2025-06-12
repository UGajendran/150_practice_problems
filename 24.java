import java.util.Scanner;
class S24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 9){
            int s = n % 9;
            if(s == 1){
                System.out.println("This is a magic number");
            }
            else{
                System.out.println("Not a magic number");
            }
        }
        else if(n == 1){
            System.out.println("This is a magic number");
        }
        else{
            System.out.println("Not a magic number");
        }
    }
}