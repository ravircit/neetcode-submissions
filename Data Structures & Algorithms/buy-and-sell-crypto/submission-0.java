class Solution {
        public int maxProfit(int[] prices) {
        int price = 0,mp=0;
        int bp=prices[0];
        for (int i = 1; i < prices.length; i++) {
            price = prices[i] - bp;
            if(prices[i]<bp)
            {
                bp=prices[i];
            }
            if(price>mp)
                mp=price;
        }
        return mp;
    }
}
