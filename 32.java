// Stepping Number or Not Neighbor number difference can be either -1 or 1
// Input-1 = 12345
// Output: Yes
// Input-2 = 1245
// Output: No
class Main{
    public static void main(String[] args){
        int n = 12345;
        String s = Integer.toString(n);
        boolean flag = false;
        for(int i = 0; i < s.length() - 1; i++){
            int i1 = Character.getNumericValue(s.charAt(i));
            int i2 = Character.getNumericValue(s.charAt(i + 1));
            if(Math.abs(i1 - i2) == 1){
                flag = true;
            }
        }
        System.out.println(flag);
    }
}