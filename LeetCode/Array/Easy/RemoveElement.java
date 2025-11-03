package LeetCode.Array.Easy;

import java.util.Arrays;

// Q. Find out the unique element and place them into the last of the array.
//Note that the five elements can be returned in any order.
//It does not matter what you leave beyond the returned k (hence they are underscores).


public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i : nums){
            if(i != val){
                nums[count++]=i;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int []nums = {0,1,2,2,3,0,4,2};
        int  val = 2;
        System.out.println(removeElement(nums,val));
    }
}
