package Stack;

import java.util.Arrays;
import java.util.Stack;

public class MaxRectangle {

    public static int calculateArea(int[]arr){
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

        int maxArea = 0;
        for(int i=0;i<arr.length;i++){
            int area = arr[i]*(nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;
    }

    public static int maxArea(int[][]mat){
        int[]a = new int[mat[0].length];
        int max = 0;
        int rmax = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    a[j]=0;
                }else{
                    a[j]++;
                }
            }
            max = calculateArea(a);
            rmax = Math.max(max,rmax);
        }

        return rmax;
    }

    public static void main(String[] args) {
        int[][]mat = {{0, 1, 1, 0},
                      {1, 1, 1, 1},
                      {1, 1, 1, 1},
                      {1, 1, 0, 0}
        };

        System.out.println("Maximum area = "+maxArea(mat));
    }
}
