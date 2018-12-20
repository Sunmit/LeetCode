class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix.length==0) return ans;
        int R = matrix.length;
        int C = matrix[0].length;
        boolean[][] used = new boolean[R][C];
        //the order of the row change
        int[] dr = new int[]{0,1,0,-1};
        //the order of the col change
        int[] dc = new int[]{1,0,-1,0};
        int r = 0,c = 0,di = 0;
        for(int i =0;i<R*C;i++){
            ans.add(matrix[r][c]);
            used[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            if(cr>=0&&cc>=0&&cr<R&&cc<C&&!used[cr][cc]){
                r=cr;
                c=cc;
            }else{
                di = (di+1)%4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }
}
