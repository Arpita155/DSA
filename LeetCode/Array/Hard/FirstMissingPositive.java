package LeetCode.Array.Hard;

import java.util.HashSet;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int k = nums.length+1;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                k = i;
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[]nums = {1,2,0};
        System.out.println("First positive missing number in the array is : "+firstMissingPositive(nums));

    }
}
