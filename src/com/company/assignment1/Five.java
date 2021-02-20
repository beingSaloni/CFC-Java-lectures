package com.company.assignment1;
import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int digits  = 0 ;

        while (num > 0){
            num = num/10;
            digits++ ;
        }
        System.out.println(digits);
    }

}
