package LeetCode.Array.Easy;

import java.util.Arrays;
import java.util.Stack;

public class SortArrayParity2 {

    public static int[] sortArrayByParityII(int[] nums) {

        // Approach-1 : --------------Brute Force ---------- T.C = O(n) , S.C = O(n)
        /*int[] res = new int[nums.length];
        int k = 0;
        int l = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                res[k]=nums[i];
                k+=2;
            }else{
                res[l]=nums[i];
                l+=2;
            }
        }

        return res;
        */

        // Approach 2 : ------------Efficient Approach---------------T.C = O(n) , S.C = O(1)
        int n = nums.length;
        int ei = 0;
        int oi = 1;
        while (ei < n && oi < n){
            while (ei <n && nums[ei]%2 == 0){
                ei +=2;
            }
            while (ei <n && nums[oi]%2 != 0 ){
                oi += 2;
            }
            if(ei < n && oi < n){
                int temp = nums[ei];
                nums[ei] = nums[oi];
                nums[oi] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {4,2,5,7,1,6};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));   // [4,5,2,7]
    }
}
