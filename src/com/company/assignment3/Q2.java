package com.company.assignment3;

public class Q2 {
    public static void horiwave(int [][] arr){

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");

            }
            ++i;
            for(int j = arr.length -1 ; j >= 0; j--){

                System.out.print(arr[i][j] + " ");

            }

        }

    }
    public static void main(String[] args) {

        int[][] arr ={
                {11 , 12 , 13 , 14} ,
                {21 , 22 , 23 , 24} ,
                {31 , 32 , 33, 34} ,
                {41 , 42 , 43 , 44}};

        horiwave(arr);


    }
}

