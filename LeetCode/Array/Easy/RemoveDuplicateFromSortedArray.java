package LeetCode.Easy;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // Approach -1  Using HashSet (Brute Force Approach)   T.C = O(n)  S.C = O(K) [As, hashSet add k elements].
        /*HashSet<Integer> hs = new HashSet<>();
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                nums[k++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
        */

        // Approach -2  (Efficient Approach)      T.C = O(n)  S.C = O(1)
        if (nums.length == 0) return 0;

        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int []arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));

    }
}
