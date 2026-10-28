class Solution:
    def canJump(self, nums: List[int]) -> bool:
        # get the end
        # this is important since this variable will get the end position
        end = len(nums) - 1
        # the cache
        cache = {}
        def dp(i):
            # check if the position that I'm at is end 
            # if I'm at the end, that means I can return True
            if i >= end:
                return True
            # check if this position I have visited 
            # return it since, I have already calculated
            if i in cache:
                return cache[i]
            if nums[i] == 0:
                cache[i] = False
                return cache[i]
            for jump in range(1, nums[i] + 1):
                if dp(i + jump):
                    cache[i] = True
                    return cache[i]
            cache[i] = False
            return False
        return dp(0)
    
       