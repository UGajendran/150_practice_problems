// Sum of Odd numbers
class Main{
    public static void main(String[] args){
        int n = 315627;
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;
            if(rem % 2 != 0){
                sum += rem;
            }
            temp /= 10;
        }
        System.out.println(sum);
    }
}