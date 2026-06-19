package Stack;

import java.util.Stack;

public class SumOfSubArrayMinimum {

    public static int sumSubMins(int[] arr) {
        // code here

        // --------------Naive Approach-----------  T.C = O(n^2) S.C = O(1)
        /*int n = arr.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            int min = arr[i];
            for(int j=i;j<n;j++){
                min = Math.min(min,arr[j]);
                sum += min;
            }
        }

        return sum;*/


        // -------------- Efficient Approach ---------------- T.C = O(n) S.C = O(n)
        int n = arr.length;
        int []pse = new int [n];
        int []nse = new int[n];
        int ans = 0;

        // previous smaller element
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }

        st.clear();

        // next smaller element
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }

        for(int i=0;i<n;i++){
            ans += ( arr[i]*((i-pse[i])*(nse[i]-i)) );
        }

        return ans;

    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        System.out.println("Minimum sub array sum = "+sumSubMins(arr));   // ans : 20
    }
}
