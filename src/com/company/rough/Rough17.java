package com.company.rough;

import java.util.Arrays;

public class Rough17 {
    public static int oddCells(int n, int m, int[][] indices) {
        int[][] A = new int[n][m];
        int i = 0 ;
        int j =0;
        int a = indices.length;// 2

        int r =  0;
        int c = 0;
        while (r < a){
            int row = indices[r][0]; //0,0 1,0 , 2,0
            int col = indices[r][1]; //0 , 1 , 1 ,1

        while(j < n ){

            if(i==m){
                i= 0;
                j++;
                continue;
            }
            if(j==row) {
                A[row][i]++;
            }
            if(i==col) {
                A[j][col]++;
            }

            i++;
        } r++;
         j =0;
        }
        j = 0;
        int count =0 ;
        System.out.println(Arrays.deepToString(A));
        while(j < n ){

            if(i==m){
                i= 0;
                j++;
                continue;
            }
            if(A[j][i]%2==1){
                count++;
            }

            i++;
        }

        return count;

    }
    public static void main(String[] args) {
        int[][] arr= {{0,1},{1,1}};

        System.out.println(oddCells(2 , 3,arr));
    }
}
