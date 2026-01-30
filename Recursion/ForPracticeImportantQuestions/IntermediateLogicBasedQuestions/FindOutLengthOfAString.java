package Recursion.ForPracticeImportantQuestions.IntermediateLogicBasedQuestions;

public class FindOutLengthOfAString {

    public static int findLength(String str){
        if(str.equals("")){
            return 0;
        }
        return 1 + findLength(str.substring(1));
    }
    public static void main(String[] args) {

        String str = "arpita";
        System.out.println("Length of the string = "+findLength(str));    // 6
    }
}
