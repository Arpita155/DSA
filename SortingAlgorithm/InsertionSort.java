package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int []arr = {5,3,8,2,9,7};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp =arr[i];
            int j = i-1;
            while (j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
