package com.company.rough;

import java.util.Scanner;

public class Rough2 {
    public static void main(String[] args) {
        float p , i , t , si ;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        i=sc.nextInt();
        t=sc.nextInt();
        si = p*i*t /100;
        System.out.println(si);
    }
}
