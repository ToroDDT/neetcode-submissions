class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        dp = [-1 for _ in range(len(cost) + 1)]
        def dfs(i):
            if i >= len(cost):
                if i == len(cost):
                    return 0
                else:
                    return 10000000000000
            if dp[i] != -1:
                return dp[i]
            dp[i] = cost[i] + min(dfs(i + 1), dfs(i + 2))
            return dp[i]
        return min(dfs(0), dfs(1))