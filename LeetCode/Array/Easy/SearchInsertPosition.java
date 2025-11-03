package LeetCode.Array.Easy;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(target >= nums[i]){
                res = i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        // First Input
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));    //Output : 4

        // Second Input
        int []num = {1,3,5,6};
        int tar = 5;
        System.out.println(searchInsert(num,tar));         //Output : 2
    }
}
