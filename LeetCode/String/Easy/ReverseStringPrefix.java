package LeetCode.String.Easy;

public class ReverseStringPrefix {

    public static String reversePrefix(String s, int k) {
        String rev = "";
        for(int i=k-1;i>=0;i--){
            rev += s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            rev += s.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String str = "arpita";
        System.out.println("Original string is : "+str);
        System.out.println("After reversing the prefix : "+reversePrefix(str,2));
    }
}
