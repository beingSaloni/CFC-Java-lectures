package com.company.recursionProblem;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        int board[][] = new int[4][4];
        if(nQueens(board ,0)){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j]);

                }
                System.out.println("");

            }
        }
    }

    private static boolean nQueens(int[][] board,  int row) {
        if(row >= board.length){
            return true;
        }
        for (int col = 0; col < board.length ; col++) {
            if(isSafe(board ,row ,col)){
                board[row][col] = 1;
                if(nQueens(board , row +1)){
                    return true;
                }
                board[row][col] = 0;
            }

        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]==1){
                return false;
            }

        }
        int i = 1;
        int j = 1;
        while (i  <= row && j <= col){
            if(board[row-i][col-i] == 1){
                return false;
            }
            i++;
            j++;
        }
         i = 1;
         j = 1;
        while (i <= row && j < board.length-col){
            if(board[row-i][col+i] == 1){
                return false;
            }
            i++;
            j++;
        }
        return true;

    }
}
