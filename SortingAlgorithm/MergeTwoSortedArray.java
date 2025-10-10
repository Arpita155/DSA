package SortingAlgorithms;

import java.util.Arrays;

public class MergeTwoSortedArray {

    // How to merge two sorted array.
    
    public static int[] merge(int []a1,int []a2){
        int m = a1.length;
        int n = a2.length;
        int []a3 = new int[m+n];
        int i=0,j=0,k=0;
        while (i<m && j<n){
            if(a1[i]<=a2[j]){
                a3[k]=a1[i];
                k++;
                i++;
            }else{
                a3[k]=a2[j];
                k++;
                j++;
            }
        }
        while (i<m){
            a3[k]=a1[i];
            k++;
            i++;
        }
        while (j<n){
            a3[k]=a2[j];
            k++;
            j++;
        }
        return a3;
    }
    public static void main(String[] args) {
        int []arr1 = {-5,1,3,4,9};
        int []arr2 = {1,2,5,7,10,14,21};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
