package com.company.rough;

import java.util.Arrays;

public class Rough16 {
    public static int[][] flipAndInvertImage(int[][] A) {
        int i = 0;
        int j = 0;
        int t = A[0].length;
        while(j < A.length){
            if(i ==t/2){
                j++;
                i = 0;
                continue;

            }
            int p =  A[j][i];
            A[j][i] = A[j][t-1-i];
            A[j][t-1-i] = p;

            i++;

        }
        System.out.println(Arrays.deepToString(A));

        j =0;
        while(j < A.length){
            if(i== t){
                j++;
                i = 0;
                continue;

            }
            if(A[j][i] ==1){
                A[j][i] = 0;
            }else{
                A[j][i]=1;
            }

            i++;
        }

        return A;
    }

    public static void main(String[] args) {
       int[][] accounts = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(accounts)));
        System.out.println(accounts[0][1]);

    }
}
