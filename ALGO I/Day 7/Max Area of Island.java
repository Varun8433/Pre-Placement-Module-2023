class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                if(grid[r][c] > 0){
                    int t = calc(r, c, grid);
                    max = t > max ? t : max;
                }}}
        return max;
    }
    
        private static int calc(int r, int c, int[][] grid){
        int area = 1;
        grid[r][c] = -1;
            
        if(c > 0 && grid[r][c - 1] > 0){
            area+=calc(r, c - 1, grid);
        }

        if(c + 1 < grid[r].length && grid[r][c + 1] > 0){
            area+=calc(r, c + 1, grid);
        }
            
        if(r > 0 && grid[r - 1][c] > 0){
            area+=calc(r - 1, c, grid);
        }
            
        if(r + 1 < grid.length && grid[r + 1][c] > 0){
            area+=calc(r + 1, c, grid);
        }
            
        return area;
    }
}