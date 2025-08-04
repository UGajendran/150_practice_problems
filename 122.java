// Given a String, the task is to insert another string in between the given String
// at a particular specified index in Java.
// Input:originalString = "WelcomeJava",
// stringToBeInserted = "to",
// index = 4
// Output:"WelcometoJava"
class Main{
    public static void main(String[] args){
        String org = "WelcomeJava";
        String ins = "to";
        int index = 7;
        System.out.println(org.substring(0, index) + ins + org.substring(index, org.length()));
    }
}