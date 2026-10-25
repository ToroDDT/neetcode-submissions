class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        cur = image[sr][sc]
        
        # Prevent infinite loops if the target color is the same as the starting color
        if cur == color:
            return image
            
        rows, cols = len(image), len(image[0])
        directions = [[1, 0], [0, 1], [-1, 0], [0, -1]]
        q = deque([(sr, sc)])
        
        image[sr][sc] = color
        
        while q:
            r, c = q.popleft()
            for dr, dc in directions:
                nr, nc = dr + r, dc + c
                if 0 <= nr < rows and 0 <= nc < cols and image[nr][nc] == cur:
                    image[nr][nc] = color
                    q.append((nr, nc))
                    
        return image