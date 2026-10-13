class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        area = 0
        def bfs(row, col) -> int:
            q = deque()
            grid[row][col] = "0"
            q.append([row, col])
            cur = 1
            while q:
                directions = [[1,0], [0,1], [-1,0], [0,-1]]
                node = q.popleft()
                for direction in directions:
                    nr, nc = node[0] + direction[0], node[1] + direction[1]
                    if nr >= 0 and nc >= 0 and nr < rows and nc < cols and grid[nr][nc] == 1:
                        cur += 1
                        grid[nr][nc] = 0
                        q.append([nr, nc])
            return cur    
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1:
                    area = max(bfs(r, c), area)
        return area





