package Recursion.ForPracticeImportantQuestions.IntermediateLogicBasedQuestions;

public class RemoveAllOccurrence {

    static String str="";
    public static String remove(String s, int i, char ch){
        if(i==s.length()){
            return "";
        }
        if(s.charAt(i)!=ch){
            str += s.charAt(i);
        }
        remove(s,i+1,ch);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(remove("arpita",0,'a'));     // ans : rpit
    }
}
