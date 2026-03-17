package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsOfAnArrayForDuplicateElements {

    public static void permutation(int[]arr, ArrayList<Integer> dabba, boolean[]track){
        if(dabba.size() == arr.length){
            System.out.println(dabba);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1] && !track[i-1]){
                continue;
            }
            if(!track[i]){
                dabba.add(arr[i]);
                track[i]=true;
                permutation(arr,dabba,track);
                dabba.remove(dabba.size()-1);
                track[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr = {5,1,5,5};
        boolean[]track = new boolean[arr.length];
        ArrayList<Integer> dabba = new ArrayList<>();
        Arrays.sort(arr);
        permutation(arr,dabba,track);
    }
}
