//Total Number of Words in a given string
class Main{
    public static void main(String[] args){
        String s = "He likes to write poems";
        String[] arr = s.split("\\s+");
        System.out.println(arr.length);
    }
}