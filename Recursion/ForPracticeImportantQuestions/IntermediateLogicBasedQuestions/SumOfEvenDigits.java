package Recursion.ForPracticeImportantQuestions.IntermediateLogicBasedQuestions;

public class SumOfEvenDigits {

    static int sum = 0;
    public static int DigitSum(int num ){
        if(num == 0){
            return 0;
        }
        int digit = num % 10;
        if(digit%2==0){
            sum += digit;
        }
        DigitSum(num/10);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of even Digits of the number = "+DigitSum(12345));
    }
}
