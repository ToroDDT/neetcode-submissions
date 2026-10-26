class Solution:
    def findMaxFish(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        visited = set()
        max_fish = 0
        def dfs(r, c) -> int:
            if (r, c) in visited or r < 0 or c < 0 or r == rows or c == cols or grid[r][c] == 0:
                return 0
            visited.add((r, c))
            fish = grid[r][c]
            fish += dfs(r + 1, c) + dfs(r - 1, c) + dfs(r, c + 1) + dfs(r, c - 1)
            return fish

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] > 0:
                    max_fish = max(max_fish, dfs(row, col))
        return max_fish


