class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #globalMax must need to initiated to teh first number
        globalMax = nums[0]
        curMax = 0
        for num in nums:
            if curMax < 0:
                curMax = 0
            curMax += num
            globalMax = max(curMax, globalMax)
        return globalMax
       