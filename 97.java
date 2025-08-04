//Validation of an Identifier
class Main {
    public static void main(String[] args) {
        String s1 = "_Hello123";
        String s2 = "123hello_";
        System.out.println(isValid(s1));  // true
        System.out.println(isValid(s2));  // false
    }

    private static boolean isValid(String s) {
        if (s.isEmpty()) return false;

        char first = s.charAt(0);
        if (!(Character.isLetter(first) || first == '_')) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
                return false;
            }
        }

        return true;
    }
}
