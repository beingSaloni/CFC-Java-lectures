package com.company.assignment2;

import java.util.Scanner;

public class Q3 {
    public static void cse(char a){

        if((int)a >=65 && (int)a <= 90){
            System.out.println("CapitalCase");
        }
        else if((int)a>=97 && (int)a <= 122){
            System.out.println("LowerCase");

        }else {
            System.out.println("Not a alphabet");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        cse(a);
    }
}
