class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        cols, rows = len(obstacleGrid[0]), len(obstacleGrid)
        dp = [[-1 for _ in range(cols)] for _ in range(rows)]
        def dfs(r, c):
            if r >= rows or c >= cols or obstacleGrid[rows - 1][cols - 1] == 1:
                return 0
            if r == rows - 1 and c == cols - 1:
                return 1
            if obstacleGrid[r][c] == 1:
                return 0
            if dp[r][c] != -1:
                return dp[r][c]
            dp[r][c] = dfs(r + 1, c) + dfs(r, c + 1)
            return dp[r][c]
        return dfs(0, 0)
                