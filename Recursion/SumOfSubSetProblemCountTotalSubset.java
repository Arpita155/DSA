package Recursion;

public class SumOfSubSetProblemCountTotalSubset {

    static int subset(int []arr,int sum, int counter)
    {
        if(sum == 0)
        {
            return 1;
        }
        if(counter == arr.length && sum != 0)
        {
            return 0;
        }
        return (subset(arr,sum-arr[counter],counter+1) + subset(arr,sum,counter+1));
    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,5};
        int sum = 10;
        System.out.println("Total count = "+subset(arr,sum,0));
    }
}
