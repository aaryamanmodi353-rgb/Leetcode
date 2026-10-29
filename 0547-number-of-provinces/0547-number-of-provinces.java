class Solution {

    int res;

    public void dfs(int isConnected[][], int k, boolean visited[]){

        visited[k] = true;

        int i = 0;
        for(i = 0; i < isConnected[0].length; i++){
            if(!visited[i] && isConnected[k][i] == 1){
                dfs(isConnected, i, visited);
                
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {


        res = 0;

       
    
        boolean visited[] = new boolean[isConnected.length];

        int i = 0;
        for(i = 0; i < isConnected.length; i++){
            
            for(int j = 0; j < isConnected[0].length; j++){
                if(!visited[i] && isConnected[i][j] == 1){
                     res++;
                     dfs(isConnected, i, visited);
                }
            }
                
                
            }
        return res;
        
    }
}