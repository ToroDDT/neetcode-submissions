class Solution {
    func climbStairs(_ n: Int) -> Int {
        if n <= 2 {return n}
        var prev1 = 1
        var prev2 = 2
        var cur = 0
        for _ in 3...n {
            cur = prev1 + prev2
            prev1 = prev2
            prev2 = cur
        }
        return cur
    }
}
