package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Q.Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < n - 2;i++){
            int j = i+1,k = n - 1;

            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i]>0){
                break;
            }

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }else if(sum < 0) j++;
                else k--;

            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

}
