import java.util.*;

public class GroupReverse {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 25, 35, 45};
        int d = 2;

        int n = a.length;
        for (int i = n; i > 0; i -= d) {
            int start = Math.max(0, i - d);
            int end = i - 1;

            for (int j = end; j >= start; j--) {
                System.out.print(a[j] + " ");
            }
        }
    }
}
