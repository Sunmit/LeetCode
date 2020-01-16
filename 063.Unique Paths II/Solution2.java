class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        
        //caution! init is important
        if(obstacleGrid[0][0]!=1){
            dp[0]=1;
        }
        
        
        for(int i=1;i<n;i++){
            if(obstacleGrid[0][i]==1||dp[i-1]==0){
                dp[i]=0;
            }else{
                dp[i] = 1;
            }
        }
        
        for(int i=1;i<m;i++){
            //caution init
            if(obstacleGrid[i][0]==1||dp[0]==0){
                dp[0]=0;
            }else{
                dp[0] = 1;
            }
            for(int j = 1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[j]=0;
                }else{
                    dp[j]=dp[j]+dp[j-1];
                }
            }
        }
                               
        return dp[n-1];                    
    }
}
