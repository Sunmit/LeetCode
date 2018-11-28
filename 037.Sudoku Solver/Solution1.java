class Solution {
    public void solveSudoku(char[][] board) {
        backTracking(board);
    }
    
    private boolean backTracking(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char x='1';x<='9';x++){
                        board[i][j]=x;
                        if(isValidSudoku(board)){
                            if(backTracking(board)){
                                return true;
                            }
                        }
                        board[i][j] = '.';
                    } 
                    return false;
                }
            }
            
        }
        return true;
    }
    
    private boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] block = new int[9];
        for(int i=0;i<9;i++){
            int a = i/3*3;
            for(int j=0;j<9;j++){
                char number = board[i][j];
                if(number!='.'){
                    int c = number-'1';
                    int n = 1<<c;
                    if((row[i]&n)!=0||(col[j]&n)!=0||(block[a+j/3]&n)!=0){
                        return false;
                    }
                    row[i] |= n;
                    col[j] |= n;
                    block[a+j/3] |= n;
                }
            }
        }
        return true;
    }
}
