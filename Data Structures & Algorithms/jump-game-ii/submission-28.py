class Solution:
    def jump(self, nums: List[int]) -> int:
        l, r = 0, 0
        total = 0
        while r < len(nums):
            if r == len(nums) - 1:
                return total
            maxJump = 0
            for i in range(l, r + 1):
                maxJump = max(nums[i] + i, maxJump)
            l = r + 1
            r = maxJump
            total += 1
        return total