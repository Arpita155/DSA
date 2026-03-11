package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void combination(int index, int target, List<Integer> p,List<List<Integer>> result, int[]a){
        // base case
        if(target==0){
            result.add(new ArrayList<>(p));
            return;
        }
        if(index==a.length){
            return;
        }
        if(a[index] <= target){
            p.add(a[index]);
            combination(index,target-a[index],p,result,a);
            p.remove(p.size()-1);
        }
        combination(index+1,target,p,result,a);
    }
    
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        int target = 8;
        int[]a = {2,3,5};
        combination(0,target,p,result,a);
        System.out.println(result);       // [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
    }
}
