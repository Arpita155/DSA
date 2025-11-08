package LeetCode.Array.Easy;

//Q. Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

//Return any array that satisfies this condition.

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {

        // ----------Brute Force Approach--------- T.C = O(n) S.C = O(n)
        /*int n = nums.length;
        int[] res = new int[n];
        int k = 0;
        for(int i=0;i<n;i++){   // All even numbers store in the new array
            if(nums[i]%2 == 0){
                res[k++]=nums[i];
            }

        }
        for(int i=0;i<n;i++){    // // All odd numbers store in the new array
            if(nums[i]%2 != 0){
                res[k++]=nums[i];
            }
        }

        return res;
        */

        // ---------Efficient Approach--------- T.C = O(n) S.C = O(1)
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                int temp = nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[]nums = {3,1,2,4,6,5,7,10};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));    // Output : [2, 4, 6, 10, 3, 5, 7, 1]
    }
}
