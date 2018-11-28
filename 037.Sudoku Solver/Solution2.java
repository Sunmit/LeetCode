class Solution {
    public void solveSudoku(char[][] board) {
        backTracking(board);
    }
    
    private boolean backTracking(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char x='1';x<='9';x++){
                        if(isValidSudoku(board,i,j,x)){
                            board[i][j]=x;
                            if(backTracking(board)){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    } 
                    return false;
                }
            }
            
        }
        return true;
    }
    
    private boolean isValidSudoku(char[][] board,int row,int col,char c) {
        for(int i=0;i<9;i++){
            if(board[row][i]==c
               ||board[i][col]==c
               ||board[row/3*3+i/3][col/3*3+i%3]==c){
                return false;
            }
        }
        return true;
    }
}
