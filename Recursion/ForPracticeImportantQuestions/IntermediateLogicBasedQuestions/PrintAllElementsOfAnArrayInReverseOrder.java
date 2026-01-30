package Recursion.ForPracticeImportantQuestions.IntermediateLogicBasedQuestions;

public class PrintAllElementsOfAnArrayInReverseOrder {

    public static void print(int[]arr, int n){
        if(n<0){
            return;
        }
        System.out.print(arr[n]+" ");
        print(arr,n-1);
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int n = arr.length-1;
        print(arr,n);
    }
}
