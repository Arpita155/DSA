package LeetCode.String.Easy;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        String str = arr[n-1];

        return str.length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));   // 5
    }
}
