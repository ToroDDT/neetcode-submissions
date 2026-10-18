
class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        directions = [[1, 0], [0, 1], [-1, 0], [0, -1]]
        rows, cols = len(grid), len(grid[0])
        q = deque()
        fresh_count = 0
        
        # 1. Initialize queue with all initially rotten oranges & count fresh ones
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 2:
                    q.append((row, col))
                elif grid[row][col] == 1:
                    fresh_count += 1
                    
        # If there are no fresh oranges to begin with, 0 minutes needed
        if fresh_count == 0:
            return 0
            
        time = 0
        
        # 2. BFS traversal level by level (each level = 1 minute)
        while q and fresh_count > 0:
            for _ in range(len(q)):
                r, c = q.popleft()
                
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    
                    # If it's a valid neighbor and it's fresh:
                    if 0 <= nr < rows and 0 <= nc < cols and grid[nr][nc] == 1:
                        grid[nr][nc] = 2          # Rot the orange
                        fresh_count -= 1          # Decrease fresh count
                        q.append((nr, nc))        # Add to queue for next minute
                        
            time += 1
            
        # 3. Return time if all fresh oranges rotted, else -1
        return time if fresh_count == 0 else -1