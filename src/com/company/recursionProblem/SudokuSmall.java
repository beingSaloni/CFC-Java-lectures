package com.company.recursionProblem;

import java.util.Arrays;

public class SudokuSmall {
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 3, 0},
                {0, 4, 1, 0},
                {2, 3, 0, 0},
                {0, 1, 2, 0}};
        if (solveSuduko(grid, 0, 0)) {
            System.out.println(Arrays.deepToString(grid));
        } else {
            System.out.println("No solutions found");
        }

    }

    private static boolean solveSuduko(int[][] grid, int row, int col) {
        if(grid[3][3] !=0){
        return true;
    }
        if(col==4){
            for (int i = 0; i < 4; i++) {
                if(grid[row][i] ==0){
                    return false;
                }

            }
            col=0;
            row++;
            if(solveSuduko(grid,row,col)){
                return true;
            }



        }
        if(grid[row][col]==0 ){
            int num= 1;
            int k = 1;
            while (k==1){
                for (int i = 0; i < 4; i++) {
                    if(grid[row][i] == num){
                        num++;
                        i = -1;
                    }
                }

                for (int i = 0; i < 4 ; i++) {
                    if(grid[i][col] == num){
                        num++;
                        k=1;
                        break;

                    }
                    k=2;

                }
                if(k==2){
                    if(isSafe(grid,row ,col ,num)){
                        grid[row][col]= num;
                        if(solveSuduko(grid, row, col + 1)){
                            return true;
                        };
                        grid[row][col]= 0;
                        num++;
                        k=1;

                    }else {
                        k=1;
                    }
                }
            }
        }
        return  solveSuduko(grid, row, col + 1);
    }private static boolean isSafe(int[][] grid, int row, int col ,int num) {
        if(row<=1 && col<=1){

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else if(row<=1 && col<=3){
            for (int i = 0; i < 2; i++) {
                for (int j = 2; j < 4 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }

        }else if(row<=3 && col<=1){
            for (int i = 2; i < 4; i++) {
                for (int j = 0; j < 2 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else if(row<=3 && col<=3){
            for (int i = 2; i < 4; i++) {
                for (int j = 2; j < 4; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }
        return true;
    }
}