class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        n = len(nums)
        memo1 = [-1] * (len(nums) + 1)
        memo2 = [-1] * (len(nums) + 1)
        def dfs(i, end, cache) -> int:
            if i >= end:
                return 0
            if cache[i] != -1:
                return cache[i]
            cache[i] = max(dfs(i + 1, end, cache), nums[i] + dfs(i + 2, end, cache))
            return cache[i]
        return max(dfs(0, n - 1, memo1), dfs(1, n, memo2))