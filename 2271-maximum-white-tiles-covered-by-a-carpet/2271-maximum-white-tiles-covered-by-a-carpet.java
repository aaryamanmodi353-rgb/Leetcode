class Solution {
    
    int start = 0;
    int end = 1;
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {

        int res = 0;
        int startIndx = 0;
        int cover = 0;

        Arrays.sort(tiles, (a, b) -> Integer.compare(a[0], b[0]));

        for(int endIndx = 0; res < carpetLen && endIndx < tiles.length;){

            if(startIndx == endIndx || tiles[startIndx][start] + carpetLen > tiles[endIndx][end]){

                cover += Math.min(carpetLen, tiles[endIndx][end] - tiles[endIndx][start] + 1);
                res = Math.max(cover, res);
                ++endIndx;
            }

            else{
                int partial = Math.max(0, tiles[startIndx][start] + carpetLen - tiles[endIndx][start]);

                res = Math.max(res, cover + partial);
                cover -= (tiles[startIndx][end] - tiles[startIndx][start] + 1);
                ++startIndx;
            }
        }

        return res;

        
    }
}