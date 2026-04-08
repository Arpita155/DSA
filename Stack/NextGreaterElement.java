package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {

        // Naive Approach
        /*ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag = true;
                    al.add(arr[j]);
                    break;
                }
            }
            if(!flag){
                al.add(-1);
            }
        }
        */

        // Efficient Approach
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        al.add(-1);
        for(int i=arr.length-2;i>=0;i--){
            while (!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                al.add(-1);
            }else{
                al.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(al);
        return al;
    }

    public static void main(String[] args) {
        int[]arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));   // [3,4,4,-1]
    }
}
