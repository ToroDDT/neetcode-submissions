class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        directions = [[1,0], [0,1], [-1,0], [0,-1]]
        rows, cols = len(grid), len(grid[0])
        q = deque()
        time, fresh_fruits = 0, 0
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 1:
                    fresh_fruits += 1
                elif grid[row][col] == 2:
                    q.append((row, col))
        if fresh_fruits == 0:
            return 0
        while q and fresh_fruits > 0:
            for _ in range(len(q)):
                r, c = q.popleft()
                for dr, dc in directions:
                    nr, nc = dr + r, dc + c
                    if nr >= 0 and nc >= 0 and nr < rows and nc < cols and grid[nr][nc] == 1:
                        fresh_fruits -= 1
                        grid[nr][nc] = 2
                        q.append((nr, nc))
            time += 1
        return time if fresh_fruits == 0 else -1


