package Recursion.ForPracticeImportantQuestions.AdvancedDSAFocusedQuestions;

public class GenerateAllSubsetsOfAString {

    public static void findSubsets(String s, String  curr, int index){
        if(index == s.length()) {
            System.out.print(curr+" ");
            return;
        }
        findSubsets(s,curr,index+1);   // exclude
        findSubsets(s,curr+s.charAt(index),index+1);     // include
    }
    public static void main(String[] args) {
        findSubsets("ABC","",0);
    }
}
