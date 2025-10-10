package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int []arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int []arr, int l, int mid, int r){
        int left = mid-l+1;
        int right = r-mid;
        int []LA = new int[left];
        int []RA = new int[right];
        for(int i=0;i<left;i++){
            LA[i]=arr[l+i];
        }
        for(int i=0;i<right;i++){
            RA[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=l;
        while (i<left && j<right){
            if(LA[i]<=RA[j]){
                arr[k]=LA[i];
                k++;
                i++;
            }else {
                arr[k]=RA[j];
                k++;
                j++;
            }
        }
        while (i<left){
            arr[k]=LA[i];
            k++;
            i++;
        }
        while (j<right){
            arr[k]=RA[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int []a = {9,7,8,6,4,5,2,3};
        System.out.println(Arrays.toString(a));   // Before sorting
        mergeSort(a,0,(a.length-1));
        System.out.println(Arrays.toString(a));   // After sorting
    }
}

