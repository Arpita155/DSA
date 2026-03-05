package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfAnArray {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private static void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, int start) {
        resultList.add(new ArrayList<>(tempList));

        // Iterate through the remaining elements.
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(resultList, tempList, nums, i + 1);
            // Backtrack: remove the last added element to explore other possibilities.
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[]nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
