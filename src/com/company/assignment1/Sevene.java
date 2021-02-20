package com.company.assignment1;

public class Sevene {
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

    public static void pascaltriangle(int n) {
        int row = 0 ;
        while (row < n){
            int col = 0 ;
            while (col<=row){

                    System.out.print(combination(row, col) + " ");
                col++ ;
            }
            System.out.println();
            row++ ;
        }}
    public static void main(String[] args) {

        pascaltriangle(6);

    }
}
