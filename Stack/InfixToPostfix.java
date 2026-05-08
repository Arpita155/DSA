package Stack;

import java.util.Stack;

public class InfixToPostfix {

    public static int precedence(char ch){
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static String infixToPostfix(String s){
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res += ch;
            }else if(ch == '('){
                st.push(ch);
            }else if(ch==')'){
                while (!st.isEmpty() && st.peek()!='('){
                    res += st.pop();
                }
                st.pop();
            }else{
                while (!st.isEmpty() && (precedence(st.peek()) > precedence(ch) || (precedence(st.peek()) == precedence(ch) && ch != '^'))){
                    res += st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()){
            res += st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "h^m^q^(7-4)";
        String exp = "x^a+b*c";
        String str = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("After conversion : "+infixToPostfix(s));   // hmq74-^^^
        System.out.println("After converting infix to postfix : "+infixToPostfix(exp));  // xa^bc*+
        System.out.println("After conversion : "+infixToPostfix(str));   // abcd^e-fgh*+^*+i-

    }
}
