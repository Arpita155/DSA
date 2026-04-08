package LeetCode.Array.Easy;

public class BuyTwoChocolates {

    public static int buyChoco(int[] prices, int money) {
        int minCost = Integer.MAX_VALUE;

        int n = prices.length;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int cost = prices[i]+prices[j];

                if(cost < minCost){
                    minCost = cost;
                }
            }
        }

        if(minCost <= money){
            return money - minCost;
        }else{
            return money;
        }
    }

    public static void main(String[] args) {
        int[]prices = {1,2,2};
        int money = 3;
        System.out.println(buyChoco(prices,money));
    }
}
