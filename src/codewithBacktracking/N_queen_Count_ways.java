//package codewithBacktracking;
//
//public class N_queen_Count_ways {
//    static int count=0;      //  static likhne ka yeh faida hai ki isko class ke sbhi method use kr skte hai..
//    public static boolean isSafe(char [][] board, int row, int col){
//        //vertical up
//        for(int i=row-1;i>=0;i--){
//            if(board[i][col]=='Q'){
//                return false;
//            }
//        }
//
//        // diagonal left up
//        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
//            if(board[i][j]=='Q'){
//                return false;
//            }
//        }
//
//        // diagonal right up
//        for(int i=row-1,j=col+1; i>=0 && j< board.length; i--,j++){
//            if(board[i][j]=='Q'){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void N_queen(char[][] board, int row){
//        if(row == board.length){
//            count++;
//            return;
//        }
//        for(int i=0;i< board.length;i++){
//            if (isSafe(board, row, i)) {
//                board[row][i] = 'Q';
//                N_queen(board, row + 1);
//                board[row][i] = '×';
//            }
//        }
//    }
//    public static void print(char[][] board){
//        System.out.println("------- chess board -------");
//
//        for(int i=0;i< board.length;i++){
//            for(int j=0;j< board.length;j++){
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    static int count=0;
//    public static void main(String[] args) {
//        count=0;   //  Agar test case bhut sare hoga toh hmko next test case ke lia count ko zero krne pdega....
//        int n=1;
//        char[][] board = new char[n][n];
//        for(int i=0;i< board.length;i++) {
//            for (int j = 0; j < board.length; j++) {
//                board[i][j] = '×';
//            }
//        }
//        N_queen(board,0);
//        System.out.println("Total ways to solve n queens ="+count);
//
//    }
//}













/* Another solution */


package codewithBacktracking;

public class N_queen_Count_ways {

    public static boolean isSafe(char [][] board, int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // diagonal left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j< board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static int N_queen(char[][] board, int row){
        if(row == board.length){
            return 1;

        }
        int count =0;
        for(int i=0;i< board.length;i++){
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                count =count+ N_queen(board, row + 1);
                board[row][i] = '×';
            }
        }
        return count;
    }
    public static void print(char[][] board){
        System.out.println("------- chess board -------");

        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //    static int count=0;
    public static void main(String[] args) {
        int n=1;
        char[][] board = new char[n][n];
        for(int i=0;i< board.length;i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '×';
            }
        }

        System.out.println("Total ways to solve n queens ="+N_queen(board,0));

    }
}
