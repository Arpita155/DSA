package Recursion.ForPracticeImportantQuestions.BasicQuestions;

public class CheckNumberEvenOrOdd {

    public static void evenOdd(int n){
        if(n==0){
            System.out.println("It is even number");
            return;
        }
        if(n==1){
            System.out.println("It is odd number");
            return;
        }
        evenOdd(n%2);
    }
    public static void main(String[] args) {
        evenOdd(7014);
    }
}
