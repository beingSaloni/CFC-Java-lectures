package com.company.recursionProblem;

import java.util.Arrays;

public class KnightTour2 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];

        for (int[] row : board) {
            Arrays.fill(row, -1);
        }


        int row = 0;
        int col = 0;

        if(tour(board, row, col, 0)){
            System.out.println("VALID");
        }else {
            System.out.println("Not valid");
        }
    }

    private static boolean tour(int[][] board, int row, int col, int step) {

        if(step >=64){
            for (int[] rowboard : board) {
                System.out.println(Arrays.toString(rowboard));

            }
            System.out.println("-----------------");
            return true;
        }

        if(row < 0 || row >= 8|| col < 0 || col >= 8){
            return false;
        }

        if(board[row][col] >= 0){
            return false;
        }

        board[row][col] = step;

        if(tour(board, row+1, col+2, step+1)) return true;
         if(tour(board, row+2, col+1, step+1)) return true;
        if(tour(board, row-1, col+2, step+1)) return true;
       if(tour(board, row-2, col+1, step+1)) return true;
       if(tour(board, row+1, col-2, step+1)) return true;
         if(tour(board, row+2, col-1, step+1)) return true;
          if(tour(board, row-1, col-2, step+1)) return true;
         if(tour(board, row-2, col-1, step+1)) return true;

        board[row][col] = -1;
        return false;
    }
}
