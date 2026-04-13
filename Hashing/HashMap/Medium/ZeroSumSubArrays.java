package Hashing.HashMap.Medium;

import java.util.HashMap;

public class ZeroSumSubArrays {

    public static int findSubArray(int[] arr) {
        // code here.
        int count=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            sum+=i;
            if(sum==0){
                count++;
            }
            if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }else {

                map.put(sum,1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr = {0, 0, 5, 5, 0, 0};
        System.out.println("Number of subArrays are : "+findSubArray(arr));  // ans : 6   Explanation: The 6 subArrays are [0], [0], [0], [0], [0,0], and [0,0].
    }
}
