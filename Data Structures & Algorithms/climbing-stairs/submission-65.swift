class Solution {
    func climbStairs(_ n: Int) -> Int {
        var dp = Array(repeating: -1, count: n)
        func dfs(_ i: Int) -> Int {
            if i == n {return 1}
            if i > n {return 0}
            if dp[i] != -1 {return dp[i]}
            dp[i] = dfs(i + 2) + dfs(i + 1)
            return dp[i]
        }
        return dfs(0)
    }
}
