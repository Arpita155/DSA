package LeetCode.Array.Medium;

import java.util.LinkedHashMap;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        int single = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                single = key;
            }
        }
        return single;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        System.out.println(singleNumber(arr));   // 3
    }
}
