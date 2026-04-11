package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PreviousGreaterElement {

    public static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        al.add(-1);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                al.add(-1);
            }else{
                al.add(st.peek());
            }

            st.push(arr[i]);
        }

        return al;

    }

    public static void main(String[] args) {
        int[]arr = {1, 3, 2, 4};
        System.out.println(preGreaterEle(arr));
    }
}
