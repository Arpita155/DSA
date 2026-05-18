package Stack;

import java.util.Stack;

public class InfixToPrefix {

    public static int precedence(char op){
        if(op == '+' || op=='-'){
            return 2;
        }else if(op == '*'|| op=='/'){
            return 3;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
//        String exp = "(a+(b*c))";     // abc*+
//        String exp = "x+y*(z-w)";    // +x*y-zw
        String exp = "x+y*z/w+p";
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(Character.isLetter(ch)){
                res += ch;
            }else if(ch == ')'){
                st.push(ch);
            }else if(ch=='('){
                while (!st.isEmpty() && st.peek()!=')'){
                    res += st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                while (!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                    res += st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()){
            res += st.pop();
        }
        String rev = new StringBuilder(res).reverse().toString();

        System.out.println("After converting infix to postfix : "+rev);

    }
}
