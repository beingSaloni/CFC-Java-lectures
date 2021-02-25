//package com.company.lecture15;
//
//public class MazeLeet {
//    public static void main(String[] args) {
//
//
//        int cRow =0;
//        int cCol =0 ;
//        int [][]maze ={{0,6,0},
//                {5,8,7},
//                {0,9,0}};
//
//        mazePath(maze ,cRow , cCol ,0);
//
//    }
//
//    private static int mazePath(int[][] maze, int cRow, int cCol,  int solution) {
//        if(cRow < 0 || cCol <0 || cRow >= maze.length || cCol >= maze[0].length){
//            return solution;
//        }
//        if(maze[cRow][cCol] == 0){
//
//            return solution;
//        }
//       int value = maze[cRow][cCol];
//        maze[cRow][cCol]=0;
//        int top = mazePath(maze , cRow -1 ,cCol,solution + value);
//        int right =mazePath(maze , cRow  ,cCol+1,solution + value);
//        int left=mazePath(maze , cRow ,cCol-1,solution + value);
//        int down=mazePath(maze , cRow +1 ,cCol,solution + value);
//        maze[cRow][cCol] = value;
//
//    }
//}
