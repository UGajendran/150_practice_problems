// FIND KEY:
// You are provided with 3 numbers input1,input2,input3.
// Each of these are four digit numbers within the range >=1000 and <=9999
// i.e
// 1000<=input1<=9999
// 1000<=input2<=9999
// 1000<=input3<=9999
// you are expected to find the key using the below formula
// Key=[smallest digit in the thousands place of all three numbers][LARGEST digit in
// the hundreds place of all the three numbers]
// [smallest digit in the tens place of all three numbers][LARGEST digit in the units
// place of all three numbers]
// for e.g if input1=3521,input2=2452,input3=1352,then Key=[1][5][2][2]=1522
// Assuming that the 3 numbers are passed to the given function.Complete the
// function to find and return the key.
public class FindKey {
    public static int findKey(int input1, int input2, int input3) {
        int[] thousands = {
            (input1 / 1000) % 10,
            (input2 / 1000) % 10,
            (input3 / 1000) % 10
        };
        
        int[] hundreds = {
            (input1 / 100) % 10,
            (input2 / 100) % 10,
            (input3 / 100) % 10
        };
        
        int[] tens = {
            (input1 / 10) % 10,
            (input2 / 10) % 10,
            (input3 / 10) % 10
        };
        
        int[] units = {
            input1 % 10,
            input2 % 10,
            input3 % 10
        };

        int minThousand = Math.min(thousands[0], Math.min(thousands[1], thousands[2]));
        int maxHundred = Math.max(hundreds[0], Math.max(hundreds[1], hundreds[2]));
        int minTens = Math.min(tens[0], Math.min(tens[1], tens[2]));
        int maxUnit = Math.max(units[0], Math.max(units[1], units[2]));

        int key = minThousand * 1000 + maxHundred * 100 + minTens * 10 + maxUnit;

        return key;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;

        int key = findKey(input1, input2, input3);
        System.out.println(key);  
    }
}
