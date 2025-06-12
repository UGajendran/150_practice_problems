// Problem to check whether all the numbers are arranged in ascending order
// Input-1 = 4567
// Output: Yes
// Input-2 = 4576
// Output: No
class Main{
    public static void main(String[] args){
        int n = 4576;
        String s = Integer.toString(n);
        boolean flag = true;
        for(int i = 0; i < s.length() - 1; i++){
            int i1 = Character.getNumericValue(s.charAt(i));
            int i2 = Character.getNumericValue(s.charAt(i + 1));
            if(i1 > i2){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}