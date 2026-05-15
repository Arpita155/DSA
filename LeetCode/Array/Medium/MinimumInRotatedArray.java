package LeetCode.Array.Medium;

public class MinimumInRotatedArray {

    public static int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];


        int l=0;
        int r=nums.length-1;
        int min = nums[0];
        while(l<r){
            if(nums[l]<min){
                min = nums[l];
                l++;
            }
            if(nums[r]<min){
                min=nums[r];
                r--;
            }
            else{
                break;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[]nums = {3,4,5,1,2};
        System.out.println("Minimum element is : "+findMin(nums));
    }
}
