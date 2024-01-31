class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = Integer.MAX_VALUE;
        int bestProfit = 0;

        for(int price: prices) {
            if(price <= minimumPrice) {
                minimumPrice = price;
            }
            if(price - minimumPrice > bestProfit) {
                bestProfit = price - minimumPrice;
            }
        }

        return bestProfit;
    }
}