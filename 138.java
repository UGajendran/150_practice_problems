// Find the Key:
// input1=3521, input2=2452, input3=1352
// Key= (Thousands of input1*Hundreds of input2) + smallest of input3
// Key= (3*4) +1=13
class Main{
    public static void main(String[] args){
        int n1 = 3521;
        int n2 = 2452;
        int n3 = 1352;
        int key = 0;
        int rem1 = 0, rem2 = 0, rem3 = Integer.MAX_VALUE;
        while(n1 > 0){
            int rem = n1 % 10;
            rem1 = rem;
            n1 = n1 / 10;
        }
        n2 = n2 / 100;
        rem2 = n2 % 10;
        while(n3 > 0){
            int rem = n3 % 10;
            rem3 = Math.min(rem3, rem);
            n3 = n3 / 10;
        }
        key = (rem1 * rem2) + rem3;
        System.out.println(key);
   }
}