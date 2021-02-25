package com.company.recursionProblem;

import java.util.Arrays;

public class MazeExtension {
    public static void main(String[] args) {
//        int maze[][] = {{0,  0, 0, 0},
//                        {0, -1, 0, 0},
//                        {-1, 0, 0, 0},
//                        {0,  0, 0, 0}};
        int[][] maze = { { 1, 0, 1 ,0, 1 },
                         { 1, 1, 1, 1 ,1 },
                         { 1, 0, 0, 1 ,1 },
                         { 1, 1, 1, 0,1  } };

        int[] count = new int[1];

        System.out.println(Arrays.toString(numsOfWays(maze,0,0 ,count )));
    }

    private static int[] numsOfWays(int[][] maze, int row, int col ,int[] count ) {
       if(row == maze.length-1 && col == maze[0].length-1){
           count[0] =count[0]+1;
           return count;
       }
           if(col < maze[0].length-1){
            if(maze[row][col+ 1]==1){
               numsOfWays(maze,row,col +1 ,count);


            }}
           if(row < maze.length-1){
        if(maze[row +1][col]==1){
            numsOfWays(maze,row+1,col  ,count);

            }
        }
        return count;
    }

}
