class Solution {
    func climbStairs(_ n: Int) -> Int {
        var dp: [Int] = Array(repeating: -1, count: n)
        func dfs(_ i: Int) -> Int {
            if i >= n {
                if i == n {
                    return 1
                }
                else {
                    return 0
                }
            }
            if dp[i] != -1{
                return dp[i]
            }
            dp[i] = dfs(i + 1) + dfs(i + 2)
            return dp[i]
        }
        return dfs(0)
    }
}
