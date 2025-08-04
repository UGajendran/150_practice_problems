import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);

        for (List<Integer> perm : result) {
            System.out.print(perm);
        }
    }

    public static void backtrack(int[] nums, List<Integer> tempList, boolean[] used, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; 
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(nums, tempList, used, result);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}
