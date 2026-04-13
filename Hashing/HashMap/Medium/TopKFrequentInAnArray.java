package Hashing.HashMap.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TopKFrequentInAnArray {

    public static ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : arr){
            if(!hm.containsKey(i)){
                hm.put(i,1);
                al.add(i);
            }
            else{
                hm.put(i,hm.get(i)+1);
            }
        }

        Collections.sort(al, (a, b) -> {
            int freqA = hm.get(a);
            int freqB = hm.get(b);
            if (freqA != freqB) {
                return freqB - freqA;
            } else {
                return b - a;
            }
        });
        return new ArrayList<>(al.subList(0, k));
    }

    public static void main(String[] args) {
        int[]arr = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;
        System.out.println(topKFreq(arr,k));
    }
}
