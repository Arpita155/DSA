package LeetCode.Array.Medium;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int peak = Integer.MIN_VALUE;
        int peakIdx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>peak){
                peak = nums[i];
                peakIdx = i;
            }
        }

        return peakIdx;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println("The index of Peak element is : "+findPeakElement(arr));
    }
}
