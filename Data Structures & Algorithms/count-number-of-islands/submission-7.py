class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows, cols = len(grid), len(grid[0])
        islands = 0
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1":
                    self.bfs(grid, r, c)
                    islands += 1
        return islands

    def bfs(self, grid, r, c):
        directions = [[1,0], [0,1], [-1,0], [0,-1]]
        q = deque()
        grid[r][c] = "0"
        q.append([r, c])
        while q:
            node = q.popleft()
            for direction in directions:
                nr, nc = direction[0] + node[0], direction[1] + node[1]
                if nr >= 0 and nc >= 0 and nr < len(grid) and nc < len(grid[0]) and grid[nr][nc] == "1":
                    grid[nr][nc] = "0"
                    q.append([nr, nc])

