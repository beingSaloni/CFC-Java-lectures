package com.company.assignment1;
import java.util.Scanner;
public class rough {

    public static int factorial(int num){
        if (num<1){
            return 1 ;
        }
        else {
            return factorial(num-1)*num;
        }
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt() ;
        int a = 0 ;
        String result = "";
        for (int i = 0; i < b; i ++) {
            a =sc.nextInt();

            result = result + String.valueOf(factorial(a)) + " ";

        }
        for (int i = 0; i < result.length(); i++) {



        }
}}
