// Program to count the characters which has lower followed by higher
// Input="accept Van"
// Output=2
class Main{
    public static void main(String[] args){
        String s = "accept Van";
        boolean found = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!found && (c >= 'A' || c <= 'Z')){
                found = true;
                continue;
            }
            else if(found && (c >= 'a' || c <= 'z')){
                count++;
            }
        }
        System.out.println(count);
    }
}