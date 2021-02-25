package com.company.lecture12;

import java.util.Arrays;

public class NQueens2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        if(nQueen(board ,0 ) ) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");

                }
                System.out.println();

            }
        }
    }

    private static boolean  nQueen(int[][] board, int row) {
        if(row>=board.length){

            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(row, j ,board)){
                board[row][j] = 1;
                if(nQueen(board ,row+1)){
                    return true;

                }
                board[row][j] = 0;
            }


        }
        return false;
    }

    private static boolean isSafe(int i, int j , int[][] board) {
        for (int k = 0; k < i; k++) {
            if (board[k][j] == 1){
                return false;
            }

        }

        int leftDiagonal = Math.min(i , j);
        for (int k = 1; k < leftDiagonal; k++) {
            if(board[i-k][j-k]==1){
                return false;
            }
        }
        int rightDiagonal = Math.min(i , board.length-j-1);
        for (int k = 1; k <= rightDiagonal; k++) {
            if(board[i-k][j+k]==1){
                return false;
            }
        }
        return true;
    }

}
