class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows, cols = len(grid), len(grid[0])
        islands = 0
        def bfs(r, c):
            directions = [[1,0], [0,1], [-1,0], [0,-1]]
            q = deque()
            grid[r][c] = "0"
            q.append((r, c))
            while q: 
                cr, cc = q.popleft()
                for dr, dc in directions:
                    nr, nc = cr + dr, cc + dc
                    if nr >= 0 and nc >= 0 and nr < rows and nc < cols and grid[nr][nc] == "1":
                        grid[nr][nc] = "0"
                        q.append((nr, nc))

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == "1":
                    islands += 1
                    bfs(row, col)
        return islands

