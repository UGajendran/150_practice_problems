// Reverse odd position based on the input
// Input:"I love programming in python language"
// Position to reverse: "odd"
// Output: "I evol programming ni python egaugnal"
class Main{
    public static void main(String[] args){
        String s = "I love programming in python language";
        String s2 = "odd";
        String[] arr = s.split("\\s+");
        System.out.println(help(arr, s2));
    }
    private static String help(String[] arr, String s2){
        String op = "";
        if(s2.equals("odd")){
            for(int i = 0; i < arr.length; i++){
                if(i % 2 != 0){
                    StringBuilder sb = new StringBuilder(arr[i]);
                    op += sb.reverse().toString() + " ";
                }
                else{
                    op += arr[i] + " ";
                }
            }
            return op.trim();
        }
        else{
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){
                    StringBuilder sb = new StringBuilder(arr[i]);
                    op += sb.reverse().toString() + " ";
                }
                else{
                    op += arr[i] + " ";
                }
            }
            return op.trim();
        }
    }
}