class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        freq = {}
        for i in range(len(nums)):
            if nums[i] not in freq:
                freq[nums[i]] = i
            else:
                val = abs(freq[nums[i]] - i)
                if val <= k:
                    return True
                else:
                    freq[nums[i]] = i
        return False