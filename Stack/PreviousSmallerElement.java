package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PreviousSmallerElement {

    public static ArrayList<Integer> preSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<=st.peek()){
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
        int[]arr = {1,8,5,13,7,8,10,2, 4};
        System.out.println(preSmallerEle(arr));     // [-1, 1, 1, 5, 5, 7, 8, 1, 2]
    }
}
