package Recursion.ForPracticeImportantQuestions.BasicQuestions;

public class ReverseANumber {

    static int rev = 0;
    public static int reverse(int n){
        if(n==0){
            return 0;
        }

        rev = rev*10+(n%10);
        reverse(n/10);
        return rev;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse(n));
    }
}
