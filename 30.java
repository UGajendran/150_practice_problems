// Problem to count the total number of odd and even in the given any digit number
// Input = 53467
// Ans:
// Odd=3
// Even=2
class Main{
    public static void main(String[] args){
        int n = 53467;
        int odd = 0;
        int even = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
            n /= 10;
        }
        System.out.println("odd: " + odd);
        System.out.println("even: " + even);
    }
}