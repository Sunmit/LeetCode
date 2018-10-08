class Solution {
    public boolean isMatch(String s, String p) {
        if(s==null||p==null){
            return false;
        }
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='*'&&dp[0][i-1]){ //p不可能*开始 否则数组越界
                dp[0][i+1]=true;//这里不是很懂
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<p.length();j++){
                if(p.charAt(j)==s.charAt(i)){
                    dp[i+1][j+1]=dp[i][j];
                }
                
                if(p.charAt(j)=='.'){
                    dp[i+1][j+1]=dp[i][j];
                }
                
                if(p.charAt(j)=='*'){
                    if(p.charAt(j-1)!=s.charAt(i)&&p.charAt(j-1)!='.'){//匹配失败
                        dp[i+1][j+1]=dp[i+1][j-1];//不是很清楚
                    }else{
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]); ///不是很清楚
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
