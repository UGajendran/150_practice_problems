// Program to reverse the number using a loop
// Ex: 143
// Output: 341
class Main{
    public static void main(String[] args){
        int n = 143;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        
    System.out.println(rev);
    }
}