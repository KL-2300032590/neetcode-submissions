class Solution {
    int n;
    int m;
    public int islandPerimeter(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    return dfs(i,j,grid);
                }
            }
        }
        return -1;
    }
    int dfs(int i,int j,int grid[][]){
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) { return 1; }

        if(grid[i][j] == -1)return 0;
        grid[i][j] = -1;
        return 
            dfs(i-1,j,grid) + dfs(i+1,j,grid) +dfs(i,j-1,grid) + dfs(i,j+1,grid);
    }
}