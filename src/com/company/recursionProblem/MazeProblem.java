package com.company.recursionProblem;

import com.company.lecture6.Array;

import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
//        int[][] maze = { { 1, 0, 1 ,0, 1 },
//                         { 1, 1, 1, 1 ,1 },
//                         { 1, 0, 0, 1 ,1 },
//                         { 1, 1, 1, 0,1  } };
        int[][] maze = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        int [][] output = new int[maze.length][maze[0].length];
        output[0][0]=1;
        if(solveMaze(maze, output,0 ,0)){
            System.out.println(Arrays.deepToString(output));
        }else {
            System.out.println("No solution found");
        }
    }

    private static boolean solveMaze(int[][] maze, int[][] output, int row, int col) {
        if(output[maze.length-1][maze[0].length-1] ==1){
            return true;
        }
        if(row <= maze.length-1 && col < maze[0].length-1){
        if(maze[row][col +1]==1 ){
            output[row][col +1]=1;
            if(solveMaze(maze,output,row,col+1)){
                return true;
            }else {
                output[row][col +1]=0;
            }

        }}
        if(row < maze.length-1 && col <= maze[0].length-1){
        if (maze[row +1][col]==1  ){
            output[row + 1][col]=1;
            if(solveMaze(maze,output,row + 1,col)){
                return true;
            }else {
                output[row + 1][col]=0;
            }
        }}
        return false;

    }
}
