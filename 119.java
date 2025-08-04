// Reverse sentence
// Input: "Programming is fun"
// Output: "fun is Programming"
class Main{
    public static void main(String[] args){
        String s = "Programming is fun";
        String op = "";
        String[] arr = s.split("\\s+");
        for(int i = arr.length - 1; i >= 0; i--){
            op += arr[i] + " ";
        }
        System.out.println(op.trim());
    }
}