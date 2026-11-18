class Solution {

    int dp[][];

    public int buysellStocks(int prices[], int i, int n, int k, int dp[][]){
        if(i == n){
            return 0;
        }
        if(k == 0){
            return 0;
        }

        if(dp[i][k] != -1){
            return dp[i][k];
        }
       

        if(k == 2){
            int buyStocks = buysellStocks(prices, i + 1, n, k - 1, dp) - prices[i];
            int notbuyStocks = buysellStocks(prices, i + 1, n, k, dp);

            return dp[i][k] = Math.max(buyStocks, notbuyStocks);
        }

        else{

            int sellStocks = buysellStocks(prices, i + 1, n, k - 1, dp) + prices[i];
            int notsellStocks = buysellStocks(prices, i + 1, n, k, dp);

            return dp[i][k] = Math.max(sellStocks, notsellStocks);   
            
            }

        
    }

    public int maxProfit(int[] prices) {

        int n = prices.length;
        
        int k = 2;

        dp = new int[n + 1][k + 1];

        for(int row[] : dp){
            Arrays.fill(row, -1);
        }

        return buysellStocks(prices, 0, n, k, dp);


        
        
    }
}