package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {

    public static ArrayList<Integer> calculateSpan(int[]arr){

        // Naive Approach
        /*ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int span = 1;
            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--){     // T.C = O(n^2)  in worst case
                span++;
            }
            res.add(span);
        }
        return res;
        */

        // Efficient Approach
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        res.add(1);
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while ( !st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res.add(i+1);
                st.push(i);
            }else{
                res.add(i-st.peek());
                st.push(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[]arr = {30,10,5,60,40,10,5,20,300};
        int[]a={10,4,5,90,120,80};
        System.out.println(calculateSpan(arr));    // [1, 1, 1, 4, 1, 1, 1, 3, 9]
        System.out.println(calculateSpan(a));      // [1, 1, 2, 4, 5, 1]
    }
}
