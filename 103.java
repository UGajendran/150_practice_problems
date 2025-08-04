// Program to remove the palindromic string from the given input string
// "In India Malayalam is best with dad and mom"
// Output: "In India is best with and"
class Main{
    public static void main(String[] args){
        String s = "In India Malayalam is best with dad and mom";
        String[] arr = s.split(" ");
        String op = "";
        for(int i = 0; i < arr.length; i++){
            if(!isPal(arr[i])){
                op += arr[i] + " ";
            }
        }
        System.out.println(op);
    }
    private static boolean isPal(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            return true;
        }
        return false;
    }
}