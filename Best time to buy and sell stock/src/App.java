class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {

            // Cek harga terendah
            if (buy > prices[i])
                buy = prices[i];

            // cek profit tertinggi
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices = { 2, 4, 1 };
        int[] prices1 = { 1, 2 };
        int[] prices2 = { 7, 1, 5, 6, 3, 4 };

        int result = solution.maxProfit(prices);
        int result1 = solution.maxProfit(prices1);
        int result2 = solution.maxProfit(prices2);

        System.out.println(result == 2);
        System.out.println(result1 == 1);
        System.out.println(result2 == 5);
    }
}