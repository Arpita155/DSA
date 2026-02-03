package Recursion.ForPracticeImportantQuestions.AdvancedDSAFocusedQuestions;

public class GeneratePermutationsOfAString {

    public static void permute(String s, String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String rem = s.substring(0,i) + s.substring(i+1);
            permute(rem, ans+ch);
        }
    }
    public static void main(String[] args) {
        permute("ABC","");
    }
}
