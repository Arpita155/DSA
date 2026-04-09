package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfMultipleArrays {

    public static List<Integer> intersection(int[][] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                hm.put(nums[i][j],hm.getOrDefault(nums[i][j],0)+1);
            }
        }
        for(int key : hm.keySet()){
            if(hm.get(key) == nums.length){
                l.add(key);
            }
        }
        Collections.sort(l);

        return l;
    }

    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println("Intersected elements are : "+intersection(nums));
    }
}
