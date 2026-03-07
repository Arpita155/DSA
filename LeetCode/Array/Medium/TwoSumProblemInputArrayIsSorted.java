package LeetCode.Array.Medium;

import java.util.Arrays;

public class TwoSumProblemInputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int []arr = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while(i<=j){
            if(numbers[i]+numbers[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                j--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[]numbers = {2,7,11,15};
        int target = 9;
        System.out.print("The index of two elements are : ");
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
