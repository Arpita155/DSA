package Recursion;

public class SubsetSumProblem {

    public static boolean subset(int []arr,int sum,int counter){

        if(sum == 0 ){
            return true;
        }
        if(counter == arr.length && sum!=0){
            return false;
        }

        return subset(arr,sum-arr[counter],counter+1) || subset(arr,sum,counter+1);
    }

    public static void main(String[] args) {
        int []arr = {5,8,2,5};
        System.out.print("Is there any subset in the array with the given sum : ");
        System.out.println(subset(arr,10,0));
    }
}
