package Hashing.HashMap;

import java.util.HashMap;

public class FirstRepeatingElement {

    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i]) > 1){
                return i+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println("The index of the first repeating element is : "+firstRepeated(arr));   // 1 based index
    }
}
