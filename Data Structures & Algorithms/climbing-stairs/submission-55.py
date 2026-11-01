class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [-1 for _ in range(n + 1)]
        def dfs(i) -> int:
            if i >= n:
                return i == n
            if dp[i] != -1:
                return dp[i]
            dp[i] = dfs(i + 2) + dfs(i + 1)
            return dp[i]
        return dfs(0)
            