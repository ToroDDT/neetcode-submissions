class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        rows, cols  = len(grid), len(grid[0])
        inf = 123455666
        dp = [[-1 for _ in range(cols)] for _ in range(rows)]
        def dfs(r, c):
            if r == rows - 1 and c == cols - 1:
                return grid[rows - 1][cols - 1]
            if r >= rows or c >= cols:
                return inf
            if dp[r][c] != -1:
                return dp[r][c]
            dp[r][c] = grid[r][c] + min(dfs(r + 1, c), dfs(r, c + 1))
            return dp[r][c]
        return dfs(0,0)
