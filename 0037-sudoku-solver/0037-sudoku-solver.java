class Solution {
    public boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0 ;i< 9;i++){
            //check for row
            if(board[row][i] == c) return false;

            //check for column
            if(board[i][col] == c) return false;

            //check for 3x3 matrix
            if(board[3* (row/3) + i/3][3* (col/3)+ i % 3] == c) return false;
        }
        return true;
    }

    public boolean solve(char[][] board){
        //try al the cells
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(board[i][j] == '.'){
                    for(char c = '1';c <='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j] =c;
                            //call recursion 
                            if(solve(board) == true) return true;
                            else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}