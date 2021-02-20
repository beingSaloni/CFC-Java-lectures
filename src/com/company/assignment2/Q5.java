package com.company.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void inverse(int num){
        int [] arr = new int[String.valueOf(num).length() + 1];
        int r = 0 ;
        while (num>0){
            r = num%10 ;
            num= num/10 ;
            if(num!=0) {
                arr[r] = String.valueOf(num).length() + 1;
            }else {
                arr[r] =String.valueOf(num).length();
            }

        }
        for (int i = 1; i < arr.length ; i++) {
            System.out.print(arr[i]);


        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        inverse(num);
    }
}
