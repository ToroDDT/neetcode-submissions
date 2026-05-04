

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashmap = {}

        for integer in nums:
            if integer in hashmap:
                return True
            hashmap[integer] = True

        return False
