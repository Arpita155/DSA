package Array;

// Q1. Problem Statement: Given an array, we have to find the largest element in the array.


import java.util.Arrays;

public class Q1_LargestElementInArray {
    public static void main(String[] args) {

        // Approach-1 : Brute force approach (At first sort the array , then print the 0th index of the sorted array.  T.C = O(n*logn)
        // process -1
        /* int [] arr = {2,5,1,3,6,9,4};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        */
        
        // Process -2
        /*int [] arr = {2,5,1,3,6,9,4};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        */

        // Approach-2 : Without sorting the array.     T.C = O(n)
        int [] arr = {2,5,1,3,0};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
