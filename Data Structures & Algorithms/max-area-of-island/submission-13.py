class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        area = 0
        rows, cols = len(grid), len(grid[0])
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1:
                    area = max(area, self.bfs(grid, r, c))
        return area
        
    def bfs(self, grid, r, c) -> int:
        directions = [[1,0], [0,1], [-1,0], [0,-1]]
        area = 1
        q = deque()
        grid[r][c] = 0
        q.append([r, c])
        while q: 
            node = q.popleft()
            for direction in directions:
                nr, nc = node[0] + direction[0], node[1] + direction[1]
                if nr >= 0 and nc >= 0 and nr < len(grid) and nc < len(grid[0]) and grid[nr][nc] == 1:
                    grid[nr][nc] = 0
                    q.append([nr, nc])
                    area = area + 1
        return area


       