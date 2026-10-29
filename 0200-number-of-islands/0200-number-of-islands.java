class Solution {

    public void dfs(char grid[][], int row, int column, boolean visited[][]){

       visited[row][column] = true;
        
        int x[] = {-1, 1, 0, 0};
        int y[] = {0, 0, -1, 1};

        

        int i = 0;
        for(i = 0; i < 4; i++){
            int newRow = row + x[i];
            int newColumn = column + y[i];


            if(valid(grid, newRow, newColumn)){

            if(!visited[newRow][newColumn] && grid[newRow][newColumn] == '1'){
                dfs(grid, newRow, newColumn, visited);
            }
            }
        }

        
    }

    public boolean valid(char grid[][],  int row, int column){
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[0].length){
            return false;
        }
        return true;
    }
    public int numIslands(char[][] grid) {

       int res = 0;

       boolean visited[][] = new boolean[grid.length][grid[0].length];




       int i = 0;
       for(i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){

            if(!visited[i][j] && grid[i][j] == '1'){
                res++;
                dfs(grid, i, j, visited);

            }
         }
           
        }

    return res;
        
    }


    
}