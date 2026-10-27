class Solution {

    public void dfs(int isConnected[][], int k, boolean visited[]){

        visited[k] = true;

        int i = 0;
        for(i = 0; i < isConnected[0].length; i++){
            if(isConnected[k][i] == 1 && visited[i] == false){
                dfs(isConnected, i, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {

        int res = 0;

        boolean visited[] = new boolean[isConnected.length];

        

        int i = 0;
        for(i = 0; i < isConnected.length; i++){
           if(visited[i] == false){
            dfs(isConnected, i, visited);
            
            res++;
           }
            
        }

        return res;
        
    }
}