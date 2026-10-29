class Solution {

    boolean res = true;
    public boolean isBipartite(int[][] graph) {
        
        List<Integer>colors = new ArrayList<>(graph.length);
       

        

 
        int i = 0;
        for(i = 0; i < graph.length; i++){
            colors.add(-1);
        }



        for(i = 0; i < colors.size(); i++){
            if(colors.get(i) == -1){
                dfs(graph, i, 1, colors);
            }
        }

        return res;
        
       



        
        
        
    }

    void dfs(int graph[][], int i, int color, List<Integer>colors){

        colors.set(i, color);
        
        for(int j = 0; j < graph[i].length; j++){
            int neighbour = graph[i][j];
            if(colors.get(neighbour) != -1 && colors.get(neighbour) == color){
                res = false;
            }

            if(colors.get(neighbour)== -1){
                dfs(graph, neighbour, 1-color, colors);
            }
        }

    }



}