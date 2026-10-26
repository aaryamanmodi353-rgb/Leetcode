class Solution {
    public int numIslands(char[][] grid) {

        
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];

        int i = 0;
        for(i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    dfs(grid, i, j, visited);
                    res++;

                }
            }
        }
        return res;
        

          
    }

    void dfs(char grid[][], int row, int col, boolean visited[][]){

        visited[row][col] = true;
        int x[] = {-1, 1, 0, 0};
        int y[] = {0, 0, -1, 1};

        for(int k = 0; k < 4; k++){
            int newRow = row + x[k];
            int newCol = col + y[k];

            if(valid(grid, newRow, newCol) && grid[newRow][newCol] == '1' && visited[newRow][newCol] == false){
                dfs(grid, newRow, newCol, visited);
            }

            
        }

    }

    boolean valid (char grid[][], int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){
            return false;
        }

        return true;
    }
}