// Split a string on hyphens
// Input: Emma-is-a-data-scientist
// Output:
// Emma
// Is
// A
// Data
// Scientist
class Main{
    public static void main(String[] args){
        String s = "Emma-is-a-data-scientist";
        String[] arr = s.split("-");
        for(String word: arr){
           System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
    }
}