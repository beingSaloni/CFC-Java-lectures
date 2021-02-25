package com.company.recursionProblem;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                         {5, 2, 0, 0, 0, 0, 0, 0, 0},
                         {0, 8, 7, 0, 0, 0, 0, 3, 1},
                         {0, 0, 3, 0, 1, 0, 0, 8, 0},
                         {9, 0, 0, 8, 6, 3, 0, 0, 5},
                         {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        if(solveGrid(grid , 0 ,0)) {
            System.out.println(Arrays.deepToString(grid));
        }else{
            System.out.println("No matches found");
        }
    }

    private static boolean solveGrid(int[][] grid, int row, int col) {
        if(row == 9 && col ==9){
            return true;
        }
        if(col==9){
            for (int i = 0; i < 9; i++) {
                if(grid[row][i] ==0){
                    return false;
                }

            }
            System.out.println(row);
            col=0;
            row++;
            if(solveGrid(grid,row,col)){
                return true;
            }


        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0){
                    for (int k = 1; k < 9; k++) {
                        grid[i][j] = k;
                        if(isSafe(grid,i ,j,k)){
                        if(solveGrid(grid, row, col + 1)){
                            return true;
                    }
                    grid[i][j]=0;

                }}}

            }

        }

        return false;


    }

    private static boolean isSafe(int[][] grid, int row, int col ,int num) {
        if(row<=2 && col<=2){

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else if(row<=2 && col<=5){
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 6 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }

        }else if(row<=2){
            for (int i = 0; i < 3; i++) {
                for (int j = 6; j < 9 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else if(row<=5 && col<=2){
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j < 3 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else if(row<=5 && col<=5){
            for (int i = 3; i < 6; i++) {
                for (int j = 3; j < 6 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else if (row<=5){
            for (int i = 3; i < 6; i++) {
                for (int j = 6; j < 9 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else if(col<=2){
            for (int i = 6; i < 9; i++) {
                for (int j = 0; j < 3 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }

        }else if(col<=5){
            for (int i = 6; i < 9; i++) {
                for (int j = 3; j < 6 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }else {
            for (int i = 6; i < 9; i++) {
                for (int j = 6; j < 9 ; j++) {
                    if(grid[i][j] == num){
                        return false ;
                    }

                }

            }
        }
        return true;

    }
}
