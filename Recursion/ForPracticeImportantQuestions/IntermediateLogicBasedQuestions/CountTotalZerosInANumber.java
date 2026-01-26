package Recursion.ForPracticeImportantQuestions.IntermediateLogicBasedQuestions;

public class CountTotalZerosInANumber {

    static int count = 0;
    public static int countZero(int num){
        if(num == 0){
            return count+1;
        }
        if(num < 0){
            return 0;
        }
        if(num%10==0){
             count++;
        }
        countZero(num/10);
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Number of zeros in the number = "+countZero(10600));
    }
}
