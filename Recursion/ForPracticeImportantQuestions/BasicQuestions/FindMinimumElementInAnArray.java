package Recursion.ForPracticeImportantQuestions.BasicQuestions;

public class FindMinimumElementInAnArray {

    public static int findMin(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],findMin(arr,n-1));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,5,3};
        int n = arr.length;
        System.out.println("Minimum element of the array = "+findMin(arr,n));
    }
}
