package Recursion.ForPracticeImportantQuestions.BasicQuestions;

public class SumOfArrayElements {

    static int sum = 0;
    public static int sumOfArray(int[] arr, int index){
        if(index==arr.length){
            return 0;
        }

        return arr[index] + sumOfArray(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 0;
        System.out.println("sum of the array elements = "+sumOfArray(arr,index));
    }
}
