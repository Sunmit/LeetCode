class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n/2+n%2;i++){
            for(int j=0;j<n/2;j++){
                int[] tmp = new int[4];
                int row =i,col=j;
                for(int k=0;k<4;k++){
                    tmp[k]= matrix[row][col];
                    int t = row;
                    row = col;
                    col = n-1-t;
                }
                
                for(int k=0;k<4;k++){
                    matrix[row][col]=tmp[(k+3)%4];
                    int t = row;
                    row = col;
                    col = n-1-t;
                }
            }
        }
    }
}
