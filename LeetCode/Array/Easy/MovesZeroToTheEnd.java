package LeetCode.Array.Easy;

import java.util.Arrays;

public class MovesZeroToTheEnd {

    public static void moveZeroes(int[] nums) {

        //Approach-1 (Brute Force Approach)    T.C = O(n)  S.C = O(n) [As, a array names []b is created with size of []nums length i.e. n].
        /*int []b = new int[nums.length];
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                b[j++]=nums[i];
            }
        }
        for(int i=0;i<b.length;i++){
            nums[i]=b[i];
        }
        System.out.println(Arrays.toString(nums));
        */

        // Approach-2  (Efficient Approach)     T.C = O(n) S.C = O(1).
        if(nums.length==0){
            return;
        }

        int k = 0;
        for(int i : nums){
            if(i != 0){
                nums[k++]=i;
            }
        }

        while(k < nums.length){
            nums[k++]=0;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int []arr = {1,0,3,0,4,5};
        moveZeroes(arr);        // [1, 3, 4, 5, 0, 0]
    }
}
