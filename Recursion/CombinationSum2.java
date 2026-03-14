package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int t, int start) {
        if(t == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        if(start == cand.length){
            return;
        }
        else{
            for (int i = start; i < cand.length; i++) {
                if(i > start && cand[i] == cand[i-1]) continue; // skip duplicates
                if(cand[i] > t){
                    break;
                }
                tempList.add(cand[i]);
                backtrack(list, tempList, cand, t - cand[i], i+1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
//        int[] candidates = {10,1,2,7,6,1,5};
//        int target = 8;
        
        int[] candidates = {2,5,2,1,2};
        int target = 5;
        System.out.println(combinationSum2(candidates,target));
    }
}
