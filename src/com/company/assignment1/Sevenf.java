package com.company.assignment1;

public class Sevenf {
    public static void main(String[] args){
        int col = 5 ;
        for (int i = 0; i <= (2*col); i++) {
            if(i < 6){
            for (int j = i; j < col; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j < (2*i)-1 ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }else{
            for (int j = 0; j < (i-col); j++) {
                System.out.print("  ");

            }
            for (int j = (2*(col))   ; j > i ; j--) {
                System.out.print("* ");

            }
                for (int j = (2*col) -1   ; j > i ; j--) {
                    System.out.print("* ");
                }
            System.out.println("");
        }}
    }
}
