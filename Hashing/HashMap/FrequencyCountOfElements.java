package Hashing.HashMap;

import java.util.HashMap;

public class FrequencyCountOfElements {

    public static void main(String[] args) {

        int[] arr = {1,2,9,23,1,2,3,6,3,2,5,4,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Integer key : map.keySet()){
            System.out.println(key +" : "+map.get(key));
        }

        //Ex : want to see the frequency of a number
        System.out.println(map.getOrDefault(3,0));
        if(map.containsKey(3)){

        }
        System.out.println();
    }
}
