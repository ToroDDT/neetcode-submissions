class Solution:
    def jump(self, nums: List[int]) -> int:
        end = len(nums) - 1
        memo = [-1 for _ in range(end)]
        def dfs(i) -> int:
            if i >= end:
                return 0 
            if memo[i] != -1:
                return memo[i]
            maxJump = min(end, nums[i] + i)
            globalMin = 123456774
            for j in range(i + 1, maxJump + 1):
                globalMin = min(1 + dfs(j), globalMin)
            memo[i] = globalMin
            return memo[i]
        return dfs(0)