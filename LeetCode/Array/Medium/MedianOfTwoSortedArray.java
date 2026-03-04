package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            al.add(nums2[i]);
        }
        Collections.sort(al);
        if(al.size()%2==0){
            return (double)(al.get(al.size()/2) + al.get(al.size()/2-1))/2;
        }

        return (double)al.get(al.size()/2);
    }

    public static void main(String[] args) {
        int []nums1 = {1,3};
        int[]nums2 = {2};
        System.out.println("Median of the two sorted array is : "+findMedianSortedArrays(nums1,nums2));
    }
}
