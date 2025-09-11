package Array;

// Q1. Problem Statement: Given an array, we have to find the largest element in the array.

public class Q1_LargestElementInArray {
    public static void main(String[] args) {
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
