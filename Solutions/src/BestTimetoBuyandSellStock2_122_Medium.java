public class BestTimetoBuyandSellStock2_122_Medium {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices == null) {
            return 0;
        }

        var result = 0;

        for (var i=0; i<prices.length-1; i++) {
            if (prices[i] < prices[i+1]) {
                result += prices[i+1] - prices[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        var result = new BestTimetoBuyandSellStock2_122_Medium().maxProfit(prices);
        System.out.println(result);
    }
}
