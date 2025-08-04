// Given an array arr[] of size n and an integer k, the task is to insert a duplicate of k
// adjacent to its every occurrence. Keep array's original length same by removing the
// elements from the back.
// Input: arr[] = [1, 0, 2, 3, 0, 4, 5, 0], K = 0
// Output: [1, 0, 0, 2, 3, 0, 0, 4]
import java.util.*;

public class DuplicateKInserter {
    public static void duplicateK(int[] arr, int k) {
        int n = arr.length;
        int countK = 0;

        for (int i = 0; i + countK < n; i++) {
            if (arr[i] == k) {
                if (i + countK == n - 1) {
                    arr[n - 1] = k;
                    n--; 
                    break;
                }
                countK++;
            }
        }

        int i = n - 1 - countK;
        int j = arr.length - 1;

        while (i >= 0) {
            if (arr[i] == k) {
                arr[j--] = k;
                arr[j--] = k;
            } else {
                arr[j--] = arr[i];
            }
            i--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int k = 0;

        duplicateK(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}
