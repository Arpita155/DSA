package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsOfAnArrayForUniqueIntegers {

    // Approach-1 ---> It consumes extra space (T.C = O(n*n!)  , S.C = O(n) )
    public static void permutation(int[]arr, ArrayList<Integer> dabba, boolean[]track){
        if(dabba.size() == arr.length){
            System.out.println(dabba);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!track[i]){
                dabba.add(arr[i]);
                track[i]=true;
                permutation(arr,dabba,track);
                dabba.remove(dabba.size()-1);
                track[i]=false;
            }
        }
    }

    // Approach-2  ----> It does not consumes extra space (T.C = O(n!*n) S.C = O(1) )
    public static void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void permutationApproach2(int []arr,int p){
        int n = arr.length;
        if(p==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=p;i<n;i++){
            swap(arr,p,i);
            permutationApproach2(arr,p+1);
            swap(arr,p,i);
        }

    }

    public static void main(String[] args) {

        //Approach-1
//        int[]arr = {1,2,3};
//        boolean[]track = new boolean[3];
//        ArrayList<Integer> dabba = new ArrayList<>();
//        permutation(arr,dabba,track);

        //Approach-2
        int[]arr = {5,3,8};
        permutationApproach2(arr,0);
    }
}
