package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfAnArrayWithDuplicateElements {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, subset, res);
        return res;
    }

    private static void backtrack(int i, int[] nums, List<Integer> subset, List<List<Integer>> res) {
        if (i == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        backtrack(i + 1, nums, subset, res);
        subset.remove(subset.size() - 1);

        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        backtrack(i + 1, nums, subset, res);
    }

    public static void main(String[] args) {
        int[]arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));   // [[1, 2, 2], [1, 2], [1], [2, 2], [2], []]
    }
}
