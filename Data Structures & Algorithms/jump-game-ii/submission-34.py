class Solution:
    def jump(self, nums: List[int]) -> int:
        end = len(nums) - 1
        inf = 12345678
        dp = [-1 for _ in range(len(nums) + 1)]
        def dfs(i) -> int:
            if i >= end:
                return 0
            if nums[i] == 0:
                return inf
            if dp[i] != -1:
                return dp[i]
            maxJump = nums[i]
            totalJumps = inf
            for j in range(1, maxJump + 1):
                res = 1 + dfs(i + j)
                totalJumps = min(totalJumps, res)
                dp[i] = totalJumps
            return dp[i]
        return dfs(0)