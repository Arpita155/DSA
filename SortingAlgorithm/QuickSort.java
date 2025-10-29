package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int []a, int l , int r){
        if(l<r){
            int positionIdx = position(a,l,r);
            quickSort(a,l,positionIdx-1);
            quickSort(a,positionIdx+1,r);
        }
    }

    public static int position(int []a,int l,int r){
        int pivot = a[l];
        int i=l;
        int j=r;
        while (i<j){
            while (a[i]<=pivot && i<=r-1){
                i++;
            }
            while (a[j]>pivot && j>=l+1){
                j--;
            }
            if(i<j){
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int t = a[j];
        a[j]=pivot;
        a[l]=t;
        return j;
    }

    public static void main(String[] args) {
        int []arr = {50,10,30,40,-10,70,20,60};
        System.out.println(Arrays.toString(arr));   //Before sorting : [50, 10, 30, 40, -10, 70, 20, 60]
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));   //After Sorting : [-10, 10, 20, 30, 40, 50, 60, 70]
    }
}
