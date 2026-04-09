package Hashing.HashMap;

import java.util.HashMap;

public class AddElementsInAHashMap {

    public static void main(String[] args) {

        //Approach-1: Using getOrDefault
        int[] arr = {1,2,9,23,1,2,3,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

        // Approach-2 :  Using old way
        int[]a = {1,2,3,4,5,1,3,7,4};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int key : a){
            if(hm.containsKey(key)){
                hm.put(key,hm.get(key)+1);
            }else{
                hm.put(key,1);
            }
        }
        System.out.println(hm);

        // If you want to check that a particular element is present or not in the array
        System.out.println(map.get(8));
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(8,0));
    }

}
