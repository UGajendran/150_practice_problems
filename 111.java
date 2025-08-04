// Number of words present in the given sentences
// Input:"The quick brown fox jumps over the lazy dog"
// Output:9
class Main{
    public static void main(String[] args){
        String s = "The quick brown fox jumps over the lazy dog";
        String[] arr = s.split("\\s+");
        System.out.println(arr.length);
    }
}