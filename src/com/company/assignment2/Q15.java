package com.company.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public static int[][] pairs(int[] arr, int t , int i){
        int a ;

        int j = i+1 ;
        int n = 0 ;
        int[][] result = new int[arr.length/2][2];
        while (i < arr.length-1){
            a = t - arr[i];
            if(arr[j]==a){
                result[n][0] = arr[i] ;
                result[n][1] = a ;
                n++ ;
                j= i + 1;
                i++;
            }else if(arr[j] != a) {
                j++;

            }
            if(j >arr.length - 1){
                i++;
                j = i + 1;
            }

        }
//        for (int k = 0; k < n; k++) {
//            System.out.print("(" + result[k][0] + ","+ result[k][1] + ")" +",");
//
//        }
        return result ;

    }
    public static void triplet(int[] arr){
        int a ;
        int i = 0 ;
        int j = 1 ;
        int n = 0 ;
        int[][] result = new int[arr.length/2][2];
        while (i < arr.length-1){
            a = 9 - arr[i];
            int p = i + 1 ;
            result = pairs(arr , a , p);
            for (int k = 0; k < result.length ; k++) {
                if(result[k][0] == 0 && result[k][1]==0){
                    break;
                }
                System.out.print("(" + arr[i] + "," + result[k][0]+ "," + result[k][1]  + ")" );

            }
            i ++ ;
        }




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i]= sc.nextInt();
        }
        triplet(arr);
    }
}
