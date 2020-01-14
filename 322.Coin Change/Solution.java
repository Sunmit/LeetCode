/**
Step 1: dp[n] save the min number of coins 
Step 2: init dp[n] ==-1 and dp[coin] = 1;
Step 3: find the relation dp[n]
for example coins = [1, 2, 5]
dp[n] = min(dp[n-i],dp[n-2],dp[n-5])+1
*/
class Solution {
    public int coinChange(int[] coins, int amount) {
        // define array to save result
        int[] dp = new int[amount+1];
        
        for(int i = 1;i<=amount;i++){
            dp[i] = -1;
        }
        
        for(int coin:coins){
            if(coin==amount)
                return 1;
            if(coin<amount){
                dp[coin] = 1;
            }
            
        }
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(i>coin&&dp[i-coin]!=-1){
                    if(dp[i]==-1||dp[i]>dp[i-coin]+1){
                        dp[i] = dp[i-coin]+1;
                    }
                }
            }
            
        }
        return dp[amount];
    }
}
