package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement {

    public static ArrayList<Integer> nextSmallerElement(int[] arr) {

        // Naive Approach
        /*ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    flag = true;
                    al.add(arr[j]);
                    break;
                }
            }
            if(!flag){
                al.add(-1);
            }
        }
        return al;*/

        // Efficient Approach
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && arr[i]<=st.peek()){
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
        int[]arr = {1,8,5,9,7,8,3,6,9};
        System.out.println(nextSmallerElement(arr));   // [-1, 5, 3, 7, 3, 3, -1, -1, -1]
    }

}
