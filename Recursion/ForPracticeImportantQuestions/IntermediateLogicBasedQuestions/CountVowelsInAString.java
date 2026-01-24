package Recursion.ForPracticeImportantQuestions.IntermediateLogicBasedQuestions;

public class CountVowelsInAString {

    static int count = 0;
    public static int countVowels(String str, int i){
        str = str.toLowerCase();
        if(i==str.length()){
            return 0;
        }
        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
            count++;
        }
        countVowels(str,i+1);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countVowels("ARPIta",0));
    }
}
