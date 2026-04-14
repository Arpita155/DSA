package Hashing.HashMap;

import java.util.HashMap;

//Q. Given an array arr. Return the element that occurs at least k number of times.
//
//Note:
//
//If there are multiple answers, please return the first one.
//If there is no element found, return -1.

public class AtLeastKOccurrences {

    public static int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if(hm.get(arr[i]) ==k){
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        System.out.println(firstElementKTime(arr,2));    // ans : 4
    }
}
