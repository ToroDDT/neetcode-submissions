class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0:
            return 0
        l, r = 1, x
        curMax = 0
        while l <= r:
            mid = l + math.floor((r - l) / 2)
            if mid * mid == x:
                return mid
            elif mid * mid < x:
                curMax = max(curMax, mid)
            if mid * mid > x:
                r = mid - 1
            else:
                l = mid + 1
        return curMax

