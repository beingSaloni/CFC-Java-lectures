package com.company.assignment1;

public class Sevenb {
    public static  void main(String[] args){
//        for (int col = 1; col <= 5; col ++) {
//            for (int row = 1; row <= col ; row++) {
//                System.out.print( row + " ");
//
//            }
//
//            System.out.println("");
//
//        }
        int col = 5;
        int i = 0 ;

        while (col>0){
            i++ ;
            int row = 1 ;
            while (row <= i){
                System.out.print(row + " ");
                row++;
            }
            System.out.println("");
            col-- ;
        }
}
}
