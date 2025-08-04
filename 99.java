// Adding the number from the String input
// Input: 5ingt44t3
// Output: 52
class Main {
    public static void main(String[] args) {
        String s = "5ingt44t3";
        System.out.println(num(s));
    }
    private static int num(String s){
        int sum = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch; 
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = ""; 
                }
            }
        }

        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }
}
