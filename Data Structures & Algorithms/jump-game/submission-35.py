class Solution:
    def canJump(self, nums: List[int]) -> bool:
        if len(nums) == 1:
            return True
        if nums[0] == 0:
            return False
        dp = [False for _ in range(len(nums))]
        dp[0] = True
        for i in range(len(nums)):
            if dp[i] == False:
                return False
            if nums[i] > 0:
                index = min(len(nums) - 1, nums[i] + i)
                for n in range(i + 1, index + 1):
                    dp[n] = True
        return dp[-1]