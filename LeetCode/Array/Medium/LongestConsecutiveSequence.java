package LeetCode.Array.Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }else if(nums[i+1]==nums[i]+1){
                count++;
                max = Math.max(max,count);
            }else{
                count =1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[]nums = {100,4,200,1,3,2};
        System.out.println("Number of longest consecutive element is : "+longestConsecutive(nums));
    }
}
