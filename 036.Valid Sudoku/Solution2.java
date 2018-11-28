class Solution {
    public boolean isValidSudoku(char[][] board) {
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
