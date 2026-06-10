package LeetCode.Array.Easy;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int candy = 0;
        for(int i=cost.length-1;i>=0;i--){
            candy += cost[i--];
            if(i>=0){
                candy += cost[i--];
            }
        }

        return candy;
    }

    public static void main(String[] args) {
        int[]cost = {6,5,7,9,2,2};
        System.out.println(minimumCost(cost));
        
        // Explanation : Buy candies with costs 9 and 7
        //- Take the candy with cost 6 for free
        //- We buy candies with costs 5 and 2
        //- Take the last remaining candy with cost 2 for free
        //Hence, the minimum cost to buy all candies is 9 + 7 + 5 + 2 = 23.
    }
}
