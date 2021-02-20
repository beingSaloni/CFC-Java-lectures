package com.company.assignment1;

public class Sevend {
    public static  void main(String[] args){
        for (int col = 1; col <= 5; col ++) {
            for (int row = 5; row > col ; row--) {
                System.out.print("  ");

            }
            for (int row = col ; row < (2*col); row++) {
                System.out.print(row + " ");

            }
            for (int row = (2*(col -1))  ; row >= col; row--) {
                System.out.print(row + " ");

            }
            System.out.println("");

        }
    }}



