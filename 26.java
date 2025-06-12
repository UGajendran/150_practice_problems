// Program to print the sum of odd numbers and arrangement of odd sequence
// I/P: 361589
// Op:  315968
class Main{
    public static void main(String[] args){
        int n = 361589;
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int j = Character.getNumericValue(s.charAt(i));
            if(j % 2 != 0){
                sb.append(Character.toString(s.charAt(i)));
            }
        }
        for(int i = 0; i < s.length(); i++){
            int j = Character.getNumericValue(s.charAt(i));
            if(j % 2 == 0){
                sb.append(Character.toString(s.charAt(i)));
            }
        }
        System.out.println(sb.toString());
    }
}