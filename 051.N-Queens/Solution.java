class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] squ = new char[n][n];
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                squ[i][j] = '.';
            }
        }
        dfs(squ,0,res);
        return res;
    }
    private void dfs(char[][] squ,int rowindex,List res){
        if(rowindex == squ.length){
            res.add(convert(squ));
            return;
        }
        
        for(int i=0;i<squ.length;i++){
            if(validate(squ,rowindex,i)){
                squ[rowindex][i] = 'Q';
                dfs(squ,rowindex+1,res);
                squ[rowindex][i] = '.';
            }
        }
    }
    
    private List<String> convert(char[][] squ){
        List<String> ans = new ArrayList<>(squ.length);
        for(int i=0;i<squ.length;i++){
            StringBuffer sb = new StringBuffer();
            for(int j=0;j<squ.length;j++){
                sb.append(squ[i][j]);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
    
    private boolean validate(char[][] squ,int x,int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<squ.length;j++){
                if(squ[i][j]=='Q'&&(x-i==y-j||x-i==-y+j||y==j)){
                    return false;
                }
            }
        }
        return true;
    }
}
