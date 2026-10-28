class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();

        int x[] = {-1, 1, 0, 0};
        int y[] = {0, 0, -1, 1};

        int fresh = 0;
        int time = 0;


        int i = 0;
        for(i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                }

                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }


        while(!q.isEmpty() && fresh > 0){

            time++;
            int size = q.size();

            while(size > 0){
                int p[] = q.poll();


                int row = p[0];
                int column = p[1];



                for(int j = 0; j < 4; j++){
                    int newRow = row + x[j];
                    int newColumn = column + y[j];

                    if(valid(grid, newRow, newColumn) && grid[newRow][newColumn] == 1){
                        fresh--;
                        q.add(new int[]{newRow, newColumn});
                        grid[newRow][newColumn] = -1;
                        
                    }
                }
                size--;
            }

            

        }

        return fresh != 0 ? -1 : time;

    }

    public boolean valid(int grid[][], int row, int column){
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[0].length){
            return false;
        }

        return true;
        
    }
}