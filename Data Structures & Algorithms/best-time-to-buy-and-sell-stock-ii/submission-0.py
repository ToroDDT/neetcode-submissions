class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        dp = {}
        def dfs(i, bought):
            if i >= len(prices):
                return 0
            if (i, bought) in dp:
                return dp[(i, bought)]
            skip = dfs(i + 1, bought)
            if bought:
                res = prices[i] + dfs(i + 1, not bought)
                dp[(i, bought)] = max(skip, res)
            else:
                res = dfs(i + 1, not bought) - prices[i]
                dp[(i, bought)] = max(skip, res)
            return dp[(i, bought)]
        return dfs(0, False)
