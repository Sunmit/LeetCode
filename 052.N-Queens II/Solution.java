class Solution {
    int res=0;
    public int totalNQueens(int n) {
        boolean[] colflag = new boolean[n];
        //the point on the line y=kx+d k=1 or k = -1 so use d[] to save if the line has been used 
        boolean[] d1 = new boolean[2*n];
        boolean[] d2 = new boolean[2*n];
        backtracking(0,colflag,d1,d2,n);
        return res;
    }
    
    private void backtracking(int row,boolean[] colflag,boolean[] d1,boolean[] d2,int n){
        if(row==n){
            res++;
        }
        for(int col=0;col<n;col++){
            //y=x+id1  so id1 = y-x and insure id1>0 id1 = y-x+n;
            int id1 = col-row+n;
            //y=-x+id2 so id2 = x+y
            int id2 = row+col;
            if(colflag[col]||d1[id1]||d2[id2]){
                continue;
            }
            colflag[col] = true;
            d1[id1]=true;
            d2[id2]=true;
            backtracking(row+1,colflag,d1,d2,n);
            colflag[col] = false;
            d1[id1]=false;
            d2[id2]=false;
        }
    }
}
