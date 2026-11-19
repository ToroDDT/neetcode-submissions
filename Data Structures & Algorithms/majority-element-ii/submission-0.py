class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        res = []
        count = Counter(nums)
        threshold = 0
        if len(nums) % 3 == 0:
            threshold = math.ceil(len(nums) / 3) + 1
        else:
            threshold = math.ceil(len(nums) / 3)
        for key, val in count.items():
            if val >= threshold:
                res.append(key)
        return res