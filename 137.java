// Twin Prime. Difference between 2 numbers should be one
class Main{
    public static void main(String[] args){
        int n1 = 11;
        int n2 = 13;
        if(Math.abs(n1 - n2) <= 2){
            if(isPrime(n1) && isPrime(n2)){
                System.out.println("Twin Prime");
            }
            else{
                System.out.println("Not a twin prime");
            }
        }
        else{
            System.out.println("Not a twin prime");
        }
    }
    private static boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2) return true;
        if(n == 3) return true;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}