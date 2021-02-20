package com.company.assignment1;
public class Sevenh {
    public  static void main (String[] args){
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            for (int j = 2*i -1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j < 5 ; j++) {
                if(i==0 && j ==0){
                    continue;
                }System.out.print("* ");
            }System.out.println("");
        }for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < (2*(5-1)) -1 -i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i ; j++) {
                if(i==4 && j ==4){
                    continue;
                }

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
