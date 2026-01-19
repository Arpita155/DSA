package Recursion.ForPracticeImportantQuestions.BasicQuestions;

public class CountDigitInANumber {

    public static int countDigit(int n){
        int count = 0;
        if(n==0){
            return 0;
        }
        count++;
        return count + countDigit(n/10);
    }
    public static void main(String[] args) {
        int n = 142;
        System.out.println("Number of digits of the number = "+countDigit(n));
    }
}
