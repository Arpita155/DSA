package LeetCode.String.Easy;

public class ReversePrefixWord {

    public static String reversePrefix(String word, char ch) {
        String s = "";
        int idx = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                idx = i+1;
                String sb = new StringBuilder(word.substring(0,i+1)).reverse().toString();
                s += sb;
                break;
            }
        }
        while(idx < word.length()){
            s += word.charAt(idx);
            idx++;
        }

        return s;
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
}
