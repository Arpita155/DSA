package LeetCode.Array.Easy;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        // T.C = O(n) , S.C = O(1)
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            profit = prices[i]-min;
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));   // 6-1 = 5
    }
}
