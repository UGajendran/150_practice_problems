// User ID Generation: Joseph's team has been assigned the task of creating
// user-ids for all participants of an online gaming competition Joseph has designed
// a process for generating the user-d using the participant's First_Name ,Last_Name,
// PIN code and a number N The process defined by Joseph is as
// below –
// Step1- Compare the lengths of First_Name and Last_Name of the participant. The
// one that is shorter will be called “Smaller Name” and the one that is longer will be
// called the “longer Name” if both First_Name and Last_Name are of equal Length
// ,then the name that appears earlier in alphabetical order will be called “Smaller
// Name” and the name that appears later in alphabetical order will be
// called the “Longer Name”
// Step2 - The user-should be generated as below –
// Last Letter of the smaller name + Entre word of the longer name + Digit at position
// N in the PIN when traversing PIN from left to right +Digit at position N in the PIN
// when traversing the PIN from right to left
// Step3 - Toggle the alphabets of the user-id generated in step -2 i.e. upper-case
// alphabets should become lower-case and lower-case alphabets should become
// upper-case.
// Let us see a few examples
// Example-1 - If the participant's details are as below
// First Name = Rajiv
// Last Name =Roy
// PIN = 560037
// N= 6
// Step1 - Length of Last_Name is less than the Length of First_Name, so the Smaler
// Name is “Roy” and the Longer Name is “Rajiv”
// Step2 - The user id will be = Last Letter of the smaller name +Entre word in the
// longer name + Digit at position N in the PIN when traversing the PIN from left to
// right +Digit at position N in the PIN when traversing the PIN from right to left
// =Last Letter of “Roy”+ Entre word in Rajiv+ 6th Digit of Pin from left + 6th Digit of
// PIN from right
// =y+ Rajiv+7+5
// Therefore, user-id=yRajiv75
// Step3 -Toggle the alphabet in the user-id. So,user-id = YrAJIV75
class Main{
    public static void main(String[] args){
        String first = "Rajiv";
        String last = "Roy";
        int Pin = 560037;
        int N = 6;
        String small;
        String longer;
        String id = "";
        if(first.length() > last.length()){
            longer = first;
            small = last;
        }
        else if(first.length() < last.length()){
            longer = last;
            small = first;
        }
        else{
            if(first.compareToIgnoreCase(last) < 0){
                small = first;
                longer = last;
            }
            else{
                small = last;
                longer = first;
            }
        }
        String p = String.valueOf(Pin);
        id += String.valueOf(small.charAt(small.length() - 1)) + longer + String.valueOf(p.charAt(N - 1)) + String.valueOf(p.charAt(p.length() - N));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < id.length(); i++){
            char c = id.charAt(i);
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    c = Character.toLowerCase(c);
                    sb.append(String.valueOf(c));
                }
                else if(Character.isLowerCase(c)){
                    c = Character.toUpperCase(c);
                    sb.append(String.valueOf(c));
                }
            }else{
                    sb.append(String.valueOf(c));
                }
        }
        System.out.println(sb.toString());
    }
}