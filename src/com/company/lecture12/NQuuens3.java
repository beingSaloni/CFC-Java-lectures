package com.company.lecture12;

import java.util.Arrays;

public class NQuuens3 {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];
        if(nQueen(arr ,0 ,n)){
            System.out.println(Arrays.deepToString(arr));
        }
    }
    public static boolean nQueen(int[][] arr ,int x , int n){
        if(x>=n){
            return true;
        }
        for (int col = 0; col < n; col++) {
            if(isSafe(arr , x ,col ,n)){
                arr[x][col]=1;

                if(nQueen(arr,x +1 ,n)){
                    return true;
                }
                arr[x][col]=0;
            }

        }
        return false;


    }
    public static boolean isSafe(int[][] arr , int x , int y ,int n){
        for (int row = 0; row < x; row++) {
            if(arr[row][y] ==1){
                return false;
            }

        }
        int row = x;
        int col =y;
        while (row >= 0 && col >=0){
            if(arr[row][col] ==1){
                return false;
            }
            row--;
            col--;
        }
        row = x;
        col =y;
        while (row >= 0 && col < n){
            if(arr[row][col] ==1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}
