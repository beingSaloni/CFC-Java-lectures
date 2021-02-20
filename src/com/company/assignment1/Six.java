package com.company.assignment1;
import java.util.Scanner;

public class Six {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your number to be reversed");
        int num = sc.nextInt();
        String reverse = "";
        while (num > 0){
            int r = num% 10 ;
            num = num/10;
            String s = Integer.toString(r) ;
            reverse = reverse + s ;

        }
        System.out.println(reverse);
    }
}
