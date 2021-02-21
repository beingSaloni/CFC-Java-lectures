//package com.company.rough;
//
//import com.company.lecture6.Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Rough19 {
//    public static int numSpecial(int[][] mat) {
//        int i = 0;
//        int j= 0;
//        int count =0;
//        int r = 0 ;
//        int c = 0;
//        ArrayList<Integer>col = new ArrayList<>();
//        while (i < mat.length){
//            if(j==mat[0].length){
//                col.remove(c);
//                if(col.contains(c) ){
//                        col.remove(c);
//
//                    }else if(r==1) {
//                        count++;
//                        col.add(c);
//                    }
//                i++;
//                j=0;
//                r=0;
//                continue;
//            }
//            if(mat[i][j]==1){
//                r++;
//                col.add(i);
//                if (r==1) {
//                    c=i;
//                }
//
//
//            }
//
//          j++;
//        }
//        System.out.println(col.size());
//
//
//            return count;
//    }
//    public static void main(String[] args) {
//        int[][] grid = {{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,1},{0,0,0,0,1,0,0,0},{1,0,0,0,1,0,0,0},{0,0,1,1,0,0,0,0}};
////        int[][] grid = {{1,0,0},{0,0,1},{1,0,0}};
////        int[][] grid ={{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,1,0,0}};
//
//
//        System.out.println(numSpecial(grid ));
//    }
//}
