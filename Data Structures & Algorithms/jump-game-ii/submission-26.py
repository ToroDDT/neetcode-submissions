class Solution:
    def jump(self, nums: List[int]) -> int:
        INF = 10000000
        dp = [INF for _ in range(len(nums))]
        dp[0] = 0
        for i in range(len(nums)):
            end = min(len(nums) - 1, nums[i] + i)
            for j in range(i + 1, end + 1):
                dp[j] = min(dp[j], dp[i] + 1)
        return dp[-1]
