// Given a string of digits, remove leading zeros from it.
// Input : 00000123569
// Output: 123569
// Input: 000012356090
// Output: 12356090
class Main{
    public static void main(String[] args){
        String s = "000012356090";
        boolean f = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int num = c - '0';
            if(num >= 1){
                break;
            }
            else{
                count++;
            }
        }
        System.out.println(s.substring(count));
    }
}