class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        directions =[[0,1], [1,0], [-1,0], [0,-1]]
        rows, cols = len(grid), len(grid[0])
        q = deque()
        time = 0
        fresh = 0
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 2:
                    q.append((row, col))
                elif grid[row][col] == 1:
                    fresh += 1
        while q and fresh > 0:
            for _ in range(len(q)):
                r, c = q.popleft()
                for dr, dc in directions:
                    nr, nc = dr + r, dc + c
                    if nr >= 0 and nc >= 0 and nr < rows and nc < cols and grid[nr][nc] == 1:
                        grid[nr][nc] = 2
                        fresh -= 1
                        q.append((nr, nc))
            time += 1
        return time if fresh == 0 else -1
