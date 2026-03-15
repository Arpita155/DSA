package LeetCode.Backtracking.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfArrayForDuplicateElement {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        boolean []track = new boolean[nums.length];
        Arrays.sort(nums);
        permutation(nums,al,track,res);

        return res;
    }

    public static void permutation(int[]nums, ArrayList<Integer> al, boolean []track,List<List<Integer>> res){
        if(al.size()==nums.length){
            res.add(new ArrayList<>(al));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !track[i-1]){
                continue;
            }
            if(!track[i]){
                al.add(nums[i]);
                track[i]=true;
                permutation(nums,al,track,res);
                al.remove(al.size()-1);
                track[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        int[]nums = {1,1,2};
        System.out.println(permuteUnique(nums));    // [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
    }
}
