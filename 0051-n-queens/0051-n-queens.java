class Solution {
    // public boolean isSafe(int row,int col,char[][]board,int n){
    //     //check for left side in same row
    //     for(int j=0;j<col;j++){
    //         if(board[row][j] == 'Q') return false;

    //     }

    //     //check for upper left diagonal
    //     for(int i=row,j =col;i>=0 && j>=0;i--,j--){
    //         if(board[i][j] == 'Q') return false;
    //     }

    //     //check for lower left diagonal
    //     for(int i=row,j=col;i<n && j>=0;i++,j--){
    //         if(board[i][j] == 'Q') return false;
    //     }
    //     //if it is safe to place return true
    //     return true;

    // }
    // public void solve(int col,char[][]board,List<List<String>>ans,int n){
    //     //base case
    //     if(col == n){
    //         List<String> temp =new ArrayList<>();
    //         for(int i=0;i<n;i++){
    //             temp.add(new String(board[i]));
                
    //         }
    //         ans.add(temp);
    //         return;
    //     }

    //     //try every row to put queen for particular col
    //     for(int row =0;row<n;row++){
    //         if(isSafe(row,col,board,n)){
    //             board[row][col] = 'Q';
    //             //call recursion for next column
    //             solve(col+1,board,ans,n);
    //             //backtrack
    //             board[row][col] = '.'; 
    //         }
    //     }
    // }
    // public List<List<String>> solveNQueens(int n) {
    //     List<List<String>> ans = new ArrayList<>();
    //     char[][] board = new char[n][n];

    //     //initialize board with '.'
    //     for(int i=0;i<n;i++){
    //         Arrays.fill(board[i],'.'); 
    //      }

    //      //start solving with col 0
    //      solve(0,board,ans,n);
    //      return ans;
    // }
    public void solve(int col,char[][] board, int n, int[] leftRow,int [] UpperDiagonal,int[] LowerDiagonal, List<List<String>>ans){
        //base case where all quuen are placed
        if(col == n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        //iterate through a row
        for(int row =0;row<n;row++){
            //check safety ki queen place ho sakti hai ya nhi
            if(leftRow[row]==0 && UpperDiagonal[row + col] == 0 && LowerDiagonal[n-1+ col-row] ==0 ){
                //place queen
                board[row][col] ='Q';
                leftRow[row] = 1;
                UpperDiagonal[row + col] = 1;
                LowerDiagonal[n-1+col- row] = 1;
                //recursion call for next column
                solve(col+1,board,n,leftRow,UpperDiagonal,LowerDiagonal,ans);
                //backtrack
                board[row][col] = '.';
                leftRow[row] = 0;
                UpperDiagonal[row + col] = 0;
                LowerDiagonal[n-1+col- row] = 0;


            }

        }


     }


    public List<List<String>> solveNQueens(int n){
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row: board) Arrays.fill(row,'.');
        int []leftRow = new int[n];
        int []UpperDiagonal = new int[2*n - 1];
        int []LowerDiagonal = new int[2*n -1];
        solve(0,board,n,leftRow,UpperDiagonal,LowerDiagonal,ans);
        return ans;
    }
}