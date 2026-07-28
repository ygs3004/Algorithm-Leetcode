package ygs.leetcode.main.problem.slidingWindow.bestTimeTOBuyAndSell;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        int buy = 0;

        // 매일 파는 값을 체크, 사는 지점은 값(minPrice)이 가장 낮은 지점일 때
        for(int sell = 1; sell < prices.length; sell++){
            int buyPrice = prices[buy];
            int sellPrice = prices[sell];
            int curProfit = sellPrice - buyPrice;

            // 최저가일 경우 구매점으로 변경
            if(sellPrice < minPrice){
                buy = sell;
                minPrice = sellPrice;
                continue;
            }

            maxProfit = Math.max(curProfit, maxProfit);
        }

        return maxProfit;
    }
}