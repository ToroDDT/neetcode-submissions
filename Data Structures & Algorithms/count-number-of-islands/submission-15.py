class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        directions = [[1,0], [0,1], [-1,0], [0,-1]]
        ROWS, COLS = len(grid), len(grid[0])
        islands = 0
        def bfs(r, c):
            q = deque()
            grid[r][c] = "0"
            q.append((r, c))
            while q:
                row, col = q.popleft()
                for dr, dc in directions:
                    nr, nc = dr + row, dc + col
                    if nr >= 0 and nc >= 0 and nr < ROWS and nc < COLS and grid[nr][nc] == "1":
                        grid[nr][nc] = "0"
                        q.append((nr, nc))

        for row in range(ROWS):
            for col in range(COLS):
                if grid[row][col] == "1":
                    islands += 1
                    bfs(row, col)
        return islands