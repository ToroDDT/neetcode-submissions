class Solution {
    public int[][] DIRECTIONS = {{1,0}, {0,1}, {-1, 0}, {0, -1}};
    public int numIslands(char[][] grid) {
        int islands = 0; 
        int ROWS = grid.length; int COLS = grid[0].length;
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == '1'){
                    islands++;
                    bfs(grid, r, c);
                }
            }
        }
        return islands;
    }
    public void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[] {r, c});
        while (!q.isEmpty()) {
            int[] node = q.poll();
            for (int[] direction : DIRECTIONS) {
                int nr = node[0] + direction[0];
                int nc = node[1] + direction[1];
                if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == '1'){
                    grid[nr][nc] = '0';
                    q.add(new int[] {nr, nc});
                }
            }
        }
    }
}
