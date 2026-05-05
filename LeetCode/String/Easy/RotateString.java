package LeetCode.String.Easy;

public class RotateString {

    public static boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        for(int i=1;i<s.length();i++){
            String s1 = s.substring(i);
            s1 += s.substring(0,i);
            if(s1.equals(goal)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println("Is it possible to make s to goal : "+rotateString(s,goal));
    }
}
