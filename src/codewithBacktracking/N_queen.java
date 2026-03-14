package codewithBacktracking;

public class N_queen {

    public static boolean isSafe(char [][] board, int row,int col){
        // vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){
        if(row== board.length){
            printBoard(board);
            return;
        }
        for(int j=0;j< board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '×';
            }
        }
    }

    public static void printBoard(char[][] board){
        System.out.println("------- chess board -------");
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n=4;
        char[][] board = new char[n][n];
        for(int i=0;i< board.length;i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '×';
            }
        }
        nQueens(board,0);
    }
}











/* Pehla har jgha baithe dia queen ko fir base condition lagai agr base condition hit kar gyi toh print krwa dia....fir mena har jgha baithana se pehla isSafe condition check ki....*/










