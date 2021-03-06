/**
optimize the space
*/
class Solution {
    public int uniquePaths(int m, int n) {
        //define array
        int[] dp = new int[n];
        //init
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        
        //find the relation of array elements
        // dp[i] = dp[i-1]+dp[i]
        for(int i=1;i<m;i++){
            for(int j = 1;j<n;j++){
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[n-1];
    }
}
