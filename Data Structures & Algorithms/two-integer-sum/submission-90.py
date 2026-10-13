class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        start, end = 0, len(nums) - 1
        pairs = []
        for index, num in enumerate(nums):
            pairs.append((num, index))
        pairs.sort()
        while start < end:
            sum = pairs[start][0] + pairs[end][0] 
            if sum == target:
                return [min(pairs[start][1], pairs[end][1]), max(pairs[start][1], pairs[end][1])]
            elif sum < target: 
                start += 1
            else:
                end -= 1
        return [0, 0]
            
            
