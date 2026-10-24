class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        directions = [[1,0], [0,1], [0, -1], [-1,0]]
        res = 0
        def bfs(r, c) -> int:
            q = deque()
            grid[r][c] = 0
            q.append((r, c))
            area = 1
            while q:
                row, col = q.popleft()
                for dr, dc in directions:
                    nr, nc = dr + row, dc + col
                    if nr >= 0 and nc >= 0 and nr < rows and nc < cols and grid[nr][nc] == 1:
                        grid[nr][nc] = 0
                        area += 1
                        q.append((nr, nc))
            return area 

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 1:
                    res = max(bfs(row, col), res)
        return res