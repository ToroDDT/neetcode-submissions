class Solution:
    def canJump(self, nums: List[int]) -> bool:
        dp = [False for _ in range(len(nums))]
        dp[0] = True
        for i in range(len(nums)):
            if dp[i] == False:
                return False
            if nums[i] > 0:
                maxJump = min(nums[i] + i, len(nums) - 1)
                for j in range(i + 1, maxJump + 1):
                    dp[j] = True 
        return dp[len(nums) - 1]
            

           