package Recursion;

import java.util.ArrayList;

public class SubsetOfAnArray {

    public static void subset(int[] arr, ArrayList<Integer> currentSubset, int counter) {
        if (counter == arr.length) {
            System.out.println(currentSubset);
            return;
        }

        subset(arr, currentSubset, counter + 1);

        currentSubset.add(arr[counter]);
        subset(arr, currentSubset, counter + 1);

        currentSubset.remove(currentSubset.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2}; // The input array
        subset(arr, new ArrayList<>(), 0);
    }
}
