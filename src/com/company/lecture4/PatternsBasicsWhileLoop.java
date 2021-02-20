package com.company.lecture4;

public class PatternsBasicsWhileLoop {
    public static void square(int n) {
        int row = 0 ;

        while (row < n){
            int col = 0 ;
          while (col<n){
            System.out.print("* ");
            col++ ;
        }
        System.out.println();
          row++ ;


    }}
    public static void main(String[] args) {
        square(5);
//        int reps = 0 ;
//        while(reps<10){
//        int stars = 0 ;
//        while (stars < 5){
//            System.out.print("*");
//            stars++ ;
//        }
//        System.out.println("");
//        reps++ ;
  // }
    }}

