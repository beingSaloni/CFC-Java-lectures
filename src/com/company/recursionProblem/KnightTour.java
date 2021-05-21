package com.company.recursionProblem;

import java.util.Arrays;

public class KnightTour {
    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
         int [] row = {2, 1, -1, -2, -2, -1, 1, 2};
        int [] col = {1, 2, 2, 1, -1, -2, -2, -1};
//        int [] row = { -1 ,-2};
//        int[] col =   {-2 ,-1};
        int rank =1;
        board[0][0] = 1 ;
        if(knightTour( board , 0 , 0 , row,col ,rank)){
            System.out.println(Arrays.deepToString(board));
        }else {
            System.out.println("No matches found");
        }


    }

    private static boolean knightTour(int[][] board, int r, int c, int[] row, int[] col ,int rank) {
        if(rank>= board.length* board.length){
            return true;
        }


        for (int i = 0; i < board.length; i++) {
            if( r + row[i] >= 0 &&  c + col[i] >=0 && r + row[i] < board.length && c + col[i] < board[0].length){
            if(board[r + row[i] ][ c + col[i] ] == 0){
                board[r + row[i] ][ c + col[i] ] = rank + 1;
                if(knightTour(board, r+row[i] , c + col[i],row, col ,rank +1 )){
                    return true;
                }else {
                    board[r + row[i] ][ c + col[i] ] = 0;
                }

            }

            }


        }
        return false;
    }
}
