// Program to reverse either odd or even position based on the input
// inp1="chennaicity"
// inp2="odd"
// Output:ctecnainihy
class Main{
    public static void main(String[] args){
        String s = "chennaicity";
        String s2 = "odd";
        System.out.println(help(s, s2));
    }
    private static String help(String i1, String i2){
        String op = "";
        String rev = "";
        if(i2.equals("odd")){
            for(int i = 0; i < i1.length(); i++){
                if(i % 2 != 0){
                    rev += String.valueOf(i1.charAt(i));
                }
            }
            
            int pos = rev.length() - 1;
            for(int i = 0; i < i1.length(); i++){
                if(i % 2 != 0){
                    op += String.valueOf(rev.charAt(pos));
                    pos--;
                }
                else{
                    op += String.valueOf(i1.charAt(i));
                }
            }
        }
        else{
            {
            for(int i = 0; i < i1.length(); i++){
                if(i % 2 == 0){
                    rev += String.valueOf(i1.charAt(i));
                }
            }
            
            int pos = rev.length() - 1;
            for(int i = 0; i < i1.length(); i++){
                if(i % 2 == 0){
                    op += String.valueOf(rev.charAt(pos));
                    pos--;
                }
                else{
                    op += String.valueOf(i1.charAt(i));
                }
            }
        }
        }
        return op;
    }
}