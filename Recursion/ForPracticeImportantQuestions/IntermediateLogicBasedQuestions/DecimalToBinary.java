package Recursion.ForPracticeImportantQuestions.IntermediateLogicBasedQuestions;

public class DecimalToBinary {

    public static void convert(int num){
        if(num == 0){
            return;
        }
        convert(num/2);
        System.out.print(num%2 +" ");
    }

    public static void main(String[] args) {

        int n = 10;
        convert(n);
    }
}
