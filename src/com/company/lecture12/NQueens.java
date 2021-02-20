package com.company.lecture12;
// https://www.outreachy.org/eligibility-results/

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4 ;
        boolean[][] board = new boolean[n][n];
        nQueens(board , 0 , 0);
    }
    private static void nQueens(boolean[][] board , int row , int col){
        if(row == board.length){
            System.out.println(Arrays.deepToString(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board, row ,i )){
                board[row][i] = true;
                nQueens(board, row+1 , 0);
                board[row][i] = false;
            }

        }
    }

    private static boolean isSafe(boolean [][] board , int row , int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }

        }
        int leftDig = Math.min(row , col);
        for (int i = 0; i < leftDig; i++) {
            if(board[row -i][col-i]){
                return false;
            }

        }
        int rightDig = Math.min(row , board.length-col-1);
        for (int i = 0; i <= rightDig; i++) {
            if(board[row -i][col-i]){
                return false;
            }

        }
        return  true;
    }
}