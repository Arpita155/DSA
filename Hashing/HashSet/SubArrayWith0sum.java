package Hashing.HashSet;

import java.util.HashSet;

public class SubArrayWith0sum {

    static boolean findsum(int []arr) {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0||set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr = {4,2,-3,1,6};
        System.out.println("Is subArray with 0 sum possible : "+findsum(arr));
    }
}
