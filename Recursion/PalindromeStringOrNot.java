package Recursion;

public class PalindromeStringOrNot {

    public static boolean palindrome(String s, int i, int j){
        if(i>=j){
            return true;
        }

        return s.charAt(i)==s.charAt(j)&&palindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println("Is the string palindrome : "+palindrome(s,0,s.length()-1));
    }
}
