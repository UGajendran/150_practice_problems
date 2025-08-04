// Minimum subarray sum
// Input: A = [3, 1, 2, 4]
// Output: 17
// Explanation:
// Subarrays are [3], [1], [2], [4], [3, 1], [1, 2], [2, 4], [3, 1, 2], [1, 2, 4], [3, 1, 2, 4].
// Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17
public class Main{
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        int n = A.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            int min = A[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min, A[j]);
                total += min;
            }
        }

        System.out.println(total);
    }
}
