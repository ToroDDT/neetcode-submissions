class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        premap = {}
        for index, num in enumerate(nums):
            diff = target - num
            if diff in premap:
                return [premap[diff], index]
            premap[num] = index