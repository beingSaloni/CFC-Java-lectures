package com.company.lecture15;

public class Maze {
    public static void main(String[] args) {
        int n = 4 ;
        int m =3;
        int[][] maze = new int[m][n];
        int cRow =1 ;
        int cCol =2 ;
        int fRow = 2;
        int fcol = 0 ;
        int[][] bombs = {{0,0} ,{2,2}};
        for (int[] bomb:bombs) {
           int row = bomb[0];
           int col = bomb[1];
            maze[row][col]= 1;
        }
        mazePath(maze ,cRow , cCol ,fRow ,fcol ,"");

    }

    private static void mazePath(int[][] maze, int cRow, int cCol, int fRow, int fcol, String solution) {
        if(cRow < 0 || cCol <0 || cRow >= maze.length || cCol >= maze[0].length){
            return;
        }
        if(maze[cRow][cCol] == 1){

            return;
        }
        if(cRow== fRow && cCol == fcol){
            System.out.println(solution);
            return;
        }
        maze[cRow][cCol]=1;
        mazePath(maze , cRow -1 ,cCol,fRow ,fcol ,solution + "N");
        mazePath(maze , cRow  ,cCol+1,fRow ,fcol ,solution + "E");
        mazePath(maze , cRow ,cCol-1,fRow ,fcol ,solution + "W");
        mazePath(maze , cRow +1 ,cCol,fRow ,fcol ,solution + "S");
        maze[cRow][cCol] = 0;

    }
}
