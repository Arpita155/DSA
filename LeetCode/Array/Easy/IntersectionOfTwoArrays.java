package LeetCode.Array.Easy;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequency of each number in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check nums2 elements in the map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert List to int[]
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));   // [2,2]
    }
}
