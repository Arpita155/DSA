package LeetCode.Array.Easy;

import java.util.ArrayList;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        // Brute Force Approach----------T.C = O(n^2) , S.C = O(1)
        /*int result = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        System.out.println("The element which appears once in the array is not found ");
        return -1;
        */

        // --------Efficient Approach----------T.C = O(n) , S.C = O(1)
        int ue = 0;
        for(int i : nums){
            ue ^= i;
        }

        return ue;

    }

    public static void main(String[] args) {

        int []nums = {4,1,2,4,5,1,2};
        System.out.println(singleNumber(nums));    // 4
        ArrayList<Integer> al = new ArrayList<>();
    }
}
