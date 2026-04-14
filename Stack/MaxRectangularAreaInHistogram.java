package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MaxRectangularAreaInHistogram {

    public static int getMaxArea(int []arr) {

        //---------Naive Approach----------
        /*int maxArea = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length; i++){
            int c = 1;
            for(int j = i-1;j>=0;j--){
                if(arr[i] <= arr[j]){
                    c++;
                }
                else{
                    break;
                }
            }
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] <= arr[j]){
                    c++;
                }
                else{
                    break;
                }
            }
            int currArea = arr[i]*c;
            if(maxArea < currArea){
                maxArea = currArea;
            }
        }
        return maxArea;*/



        int[]pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int k = 0;
        // calculate previous smaller element
        for(int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[k++]=-1;
            }else{
                pse[k++]=st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(pse));
        // calculate next smaller element and put their index
        st.clear();
        int[]nse = new int[arr.length];
        k = arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[k--] = arr.length;
            }else{
                nse[k--] = st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(nse));
        int maxArea = 0;
        for(int i=0;i<arr.length;i++){
            int area = arr[i]*(nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;

    }

    public static void main(String[] args) {
//        int[]arr = {2,1,8,3,5,7};
        int[]arr = {60,20,50,40,10,50,60};
        System.out.println("Maximum area : "+getMaxArea(arr));
    }
}
