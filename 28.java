//  Arrangement of odd sequence with count followed by even sequence with count
// i/p:361589
// o/p: 31594682
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
        int n1 = sb.length();
        sb.append(Integer.toString(n1));
        for(int i = 0; i < s.length(); i++){
            int j = Character.getNumericValue(s.charAt(i));
            if(j % 2 == 0){
                sb.append(Character.toString(s.charAt(i)));
            }
        }
        int n2 = s.length() - n1;
        sb.append(Integer.toString(n2));
        System.out.println(sb.toString());
    }
}