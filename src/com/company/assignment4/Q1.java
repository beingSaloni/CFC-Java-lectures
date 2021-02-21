package com.company.assignment4;

public class Q1 {
    public static int factorial(int num){
        if (num<1){
            return 1 ;
        }
        else {
            return factorial(num-1)*num;
        }
    }
    public static int combination(int n, int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
    private static void pascal (int row , int col){
        if(col > row){
            System.out.println();
            return;
        }
        System.out.print(combination(row, col) + " ");
        col++;
        pascal(row , col);
    }


    private static void pattern(int n  , int row){
        if(n<row){

            return;
        }
        int col = 0 ;
        pascal(row , col);
        row++;
        pattern(n , row);
    }
    public static void main(String[] args) {
        pattern(5 , 0);
    }
}
