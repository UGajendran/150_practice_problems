// Find Password
// Detective Buckshee junior has been approached by the shantiniketan kids society
// for help in finding the password to the games complex.After hearing the
// scenario,detective Buckshee junior realises that he will need a programmer's
// support.He contacts you requests your help.
// Please help the detective by writing a function to generate the password.
// The scenario is as below-
// Five numbers are available with the kids.
// These numbers are either stable or unstable
// A number is stable if each of its digit occur the same number of times, i.e the
// frequency of each digit in the number is the same.
// For e.g:2277,4004,11,23,583835,1010 are examples of stable numbers.
// Similarily,A number is unstable if the frequency of each digit in the number is NOT
// the same.For eg:221,4314,101,233,58135,101 are examples of unstable numbers.
// The password can be found as below-
// i.e password=(Number of unstable numbers*10)+Number of stable numbers
// For example:
// If input1=12, input2=1313, input3=122, input4=678 and input5=898 , we see that
// there are THREE stable numbers i.e 12,1313 and 678 and
// TWO unstable numbers i.e 122 and 898
// so,the password should be=(Number of Unstable numbers*10)+Number of stable
// numbers=(2*10)+3=23
import java.util.*;
class Main{
    public static void main(String[] args){
        int input1=12, input2=1313, input3=122, input4=678, input5=898;
        int[] inputs = {input1, input2, input3, input4, input5};
        int sta = 0;
        int unsta = 0;
        for(int num: inputs){
            Set<Integer> s = new HashSet<>();
            int c = 0;
            while(num > 0){
                int rem = num % 10;
                c++;
                s.add(rem);
                num = num / 10;
            }
            if(c % s.size() == 0){
                sta++;
            }
            else{
                unsta++;
            }
        }
        int pwd = (unsta * 10) + sta;
        System.out.println(pwd);
    }
}