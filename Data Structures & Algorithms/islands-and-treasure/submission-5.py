class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        rows, cols = len(grid), len(grid[0])
        q = deque()
        INF = 2147483647
        # Find all treasures and add to queue
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 0:
                    q.append([row, col])
        while q:
            node = q.popleft()
            directions = [[1,0], [0,1], [-1,0], [0,-1]]
            for direction in directions:
                nr, nc = node[0] + direction[0], node[1] + direction[1]
                if nr >= 0 and nc >= 0 and nr < rows and nc < cols and grid[nr][nc] == INF:
                    grid[nr][nc] = grid[node[0]][node[1]] + 1
                    q.append([nr, nc])



