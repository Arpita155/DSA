package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int k = nums.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > k){
                al.add(key);
            }
        }

        return al;
    }

    public static void main(String[] args) {
        int []nums = {2,3,2};
        System.out.println("Majority element in the array is : "+majorityElement(nums));
    }
}
