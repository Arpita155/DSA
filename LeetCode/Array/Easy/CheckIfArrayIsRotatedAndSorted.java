package LeetCode.Array.Easy;

public class CheckIfArrayIsRotatedAndSorted {

    public static boolean check(int[] nums) {
        int breaks = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breaks++;
            }
        }

        return breaks <= 1;
    }

    public static void main(String[] args) {
        int[]nums = {3,4,5,1,2};
        System.out.println("Is the array rotated and sorted : "+check(nums));
    }
}
