package Array;

import java.util.Scanner;

public class Q2_SecondLargest_SecondSmallest {
    public static int secondLargest(int []arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2 && arr[i]<max1){
                max2=arr[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            return -1;
        }else {
            return max2;
        }
    }
    public static int secondSmallest(int []arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }else if(arr[i]<min2 && arr[i]>min1){
                min2=arr[i];
            }
        }
        if(min2 == Integer.MAX_VALUE){
            return -1;
        }else {
            return min2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        int []arr = {1,2,4,7,7,5};     // OUTPUT: secondSmallest 2 , secondLargest = 5
//        int []arr= {3,3,3};            // OUTPUT: secondSmallest -1 , secondLargest = -1
//        int []arr = {1};               // OUTPUT: secondSmallest -1 , secondLargest = -1
        System.out.println("Second Smallest : "+secondSmallest(arr));
        System.out.println("Second Largest : "+secondLargest(arr));

    }
}
