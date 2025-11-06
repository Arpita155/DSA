package LeetCode.Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

// Q. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.(LeetCode)
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        boolean flag = false;
        int f1 = 0;
        int f2 = 0;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    f1 = i;
                    f2 = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return new int[]{f1,f2};
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target : ");  // For 9
        int target = sc.nextInt();
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,target)));   // Output is :  [0,1]

    }
}
