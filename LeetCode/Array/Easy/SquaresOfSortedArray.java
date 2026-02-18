package LeetCode.Array.Easy;

import java.util.Arrays;

//Q. Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[]arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[]nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
