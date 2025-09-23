package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        // ----------Brute force approach-------------- :     T.C = O(n^2) S.C = O(n)
        // Approach-1
        int []arr = {5,3,8,2,9,7};
        int n = arr.length;
        int []newArray = new int[n];
        int index = 0;
        int minIdx = 0;
        for(int i=0;i<n;i++){
            int minValue = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(arr[j]< minValue){
                    minValue = arr[j];
                    minIdx=j;
                }
            }
            newArray[index++]= minValue;
            arr[minIdx]=Integer.MAX_VALUE;
        }
        System.out.println(Arrays.toString(arr));      // [2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647]
        System.out.println(Arrays.toString(newArray));   // [2, 3, 5, 7, 8, 9]

        


        // ----------Optimized Approach------------ :      T.C = O(n^2) S.C = O(1)
        /*
        int []arr = {5,3,8,2,9,7};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        */


    }
}
