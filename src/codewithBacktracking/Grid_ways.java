package codewithBacktracking;

public class Grid_ways {
    public static int no_of_Grid_ways(int i, int j,int row,int column){
        if(i==row-1 && j==column-1){
            return 1;
        }else if(i==row || j==column){
            return 0;
        }
        int w1=no_of_Grid_ways(i,j+1,row,column);  // right
        int w2=no_of_Grid_ways(i+1,j,row,column);  // down
        return w1+w2;

    }
    public static void main(String[] args) {
        int row=3;
        int column=3;
        System.out.println(no_of_Grid_ways(0,0,row,column));

    }
}








//package codewithBacktracking;
//
//public class Grid_ways {
//    public static int no_of_Grid_ways(int row,int column){
//        int[][] arr= new int[row][column];
//        for(int i=row-1;i>=0;i--){
//            for(int j=column-1;j>=0;j--){
//                if(i==row-1 || j== column-1){  // last row ya last column mea hoga toh return krega 1;
//                    arr[i][j]=1;
//                }else{
//                    arr[i][j]=arr[i+1][j] + arr[i][j+1] ;
//                }
//            }
//        }
//        return arr[0][0];
//    }
//    public static void main(String[] args) {
//        int row=3;
//        int column=3;
//        System.out.println(no_of_Grid_ways(row,column));
//
//    }
//}
