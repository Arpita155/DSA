package Stack;

public class TrappingRainWater {

    public static int maxWater(int []arr) {
        // code here

        // Approach-1    T.C=O(n^2)  S.C=O(1)
        /*int trappedWater = 0;
        for(int i=0;i<arr.length;i++){
            int lmax = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[j] > lmax){
                    lmax = arr[j];
                }
            }
            int rmax = 0;
            for(int k=i+1;k<arr.length;k++){
                if(arr[k] > rmax){
                    rmax = arr[k];
                }
            }
            int res = (Math.min(lmax,rmax)-arr[i]);
            trappedWater += Math.max(res, 0);
        }
        return trappedWater;
        */

        // Approach-2
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = arr[0];
        for ( int i = 1 ; i < n ; i++ ) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        rightMax[n-1] = arr[n-1];
        for ( int i = n-2 ; i >= 0 ; i-- ) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        int trappedWater = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            trappedWater += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }


        return trappedWater;
    }

    public static void main(String[] args) {
        int[]arr = {3, 0, 1, 0, 4, 0, 2};
        System.out.println("Maximum water trapped are : "+maxWater(arr));
    }
}
