class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int x[] = {-1, 1, 0, 0};
        int y[] = {0, 0, -1, 1};

     
        
        Queue<int[]>q = new ArrayDeque<>();

        int time = 0;
        int fresh = 0;
        
        int i = 0;
        for(i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                    grid[i][j] = -1;
                }
                if (grid[i][j] == 1){
                    fresh++;

                }

                
            }
        }
    

            while(!q.isEmpty() && fresh > 0){
                time++;
                int s = q.size();
                while(s > 0){
                    int p[] = q.poll();
                  
                  

                    int rows = p[0];
                    int columns = p[1];

                    for(int k = 0; k < 4; k++){
                        int newRow = rows + x[k];
                        int newColumn = columns + y[k];

                        if(valid(grid, newRow, newColumn) && grid[newRow][newColumn] == 1){
                            
                            q.add(new int[]{newRow, newColumn});
                            grid[newRow][newColumn] = -1;
                            fresh--;
                        }
                    }
                    s--;
                }

              


            }
            if(fresh > 0){
                return -1;
            }
            else{
                return time;
            }
        }
        
        
        
    
    boolean valid(int grid[][], int row, int column){
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[0].length){
            return false;
        }
        return true;

    }
}