package com.company.assignment2;

import java.util.Scanner;

public class Q2 {
    public static int calculator(int n , int a , char op){
        if (op == '+'){
            return a + n ;
        }else if (op== '-'){
            return  n -a ;
        }else if(op== '*'){
            return  n*a ;
        }else  if(op =='/'){
            return n/a;
        }else if(op == '%'){
            return n%a;
        }else {
            return -1 ;
        }

    }

    public static void main(String[] args) {
        int a, c;
        char b ;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.next().charAt(0);
        c = sc.nextInt();



        System.out.println(calculator(a , c , b));
    }
}
