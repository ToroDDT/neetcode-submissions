class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int res = money;
        for (int i = 0; i < 2; i++) {
            res = res - prices[i];
        }
        if (res < 0) {
            return money;
        }
        else {
            return res;
        }
    }
}