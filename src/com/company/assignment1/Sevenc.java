package com.company.assignment1;

public class Sevenc {
    public static void main(String[] args) {
        int col =5 ;
        for (int i = 0; i < col  ; i++) {
            for (int j = i; j < col ; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <=i+1  ; j++) {
                System.out.print(j + " ");

            }
            for (int j = i; j > 0  ; j--) {
                System.out.print(j + " ");

            }
            System.out.println(" ");

        }
    }
}
