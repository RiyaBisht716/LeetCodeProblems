class Solution {
    void dfs(int row,int col,char[][] grid, int[][] visited, int n ,int m){
        visited[row][col]= 1;
        int[]r = {0,1,0,-1};
        int[]c = {1,0,-1,0};
        for(int i=0;i<4;i++){
            int newrow = row + r[i];
            int newcol = col + c[i];
            if(newrow >=0 && newrow<n && newcol>=0 && newcol <m && grid[newrow][newcol] == '1' && visited[newrow][newcol] == 0){
                dfs(newrow,newcol,grid,visited, n,m);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        int islands = 0;
        int[][] visited = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    islands++;
                    dfs(i,j,grid,visited,n,m);
                }
            }
        }
        return islands;
    }
}