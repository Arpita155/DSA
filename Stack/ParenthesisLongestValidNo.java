package Stack;

import java.util.Stack;

public class ParenthesisLongestValidNo {

    public static int longestParenthesis(String s){

        Stack<Integer> st = new Stack<>();
        int maxLen = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else {
                    maxLen = Math.max(maxLen,i-st.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "))()(";
        System.out.println("Longest valid parenthesis is : "+longestParenthesis(str));  // 2
        String s1 =  ")()())";  // 4
        System.out.println(longestParenthesis(s1));
        String s2 = "((())()(";  // 6
        System.out.println(longestParenthesis(s2));
    }
}
