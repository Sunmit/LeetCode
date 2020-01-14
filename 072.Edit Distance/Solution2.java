class Solution {
    public int minDistance(String word1, String word2) {
        //define two dimension array 
        // dp[i][j] means the minimum number of operations that word1's length i convert to word2's length j
        int n1 = word1.length();
        int n2 = word2.length();
        int[] dp = new int[n2+1];
        
        //init
        
        for(int j=1;j<n2+1;j++){
            dp[j]=j;
        }
        
        /*find the relation of array's elements
            add pre to save dp[i-1][j-1]
          if word1[i]=word2[j] dp[j] = dp[j-1]
          if word1[i]!=word2[j]
            dp[j] = min(dp[j],dp[j-1],pre);
        */
        for(int i=1;i<n1+1;i++){
            int temp = dp[0];
            //init
            dp[0]=i;
            
            for(int j=1;j<n2+1;j++){
                int pre = temp;
                temp = dp[j];
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[j]=pre;
                }else{
                    dp[j]=Math.min(Math.min(dp[j],dp[j-1]),pre)+1;
                }
            }
        }
        return dp[n2];
    }
}
