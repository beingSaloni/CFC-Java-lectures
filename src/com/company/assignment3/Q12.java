package com.company.assignment3;

import java.util.Scanner;

public class Q12 {
    public static String toggle(String s){
        StringBuilder sb = new StringBuilder(s);
        s = "" + s.charAt(0);
        for (int i = 1; i < sb.length(); i++) {

            char c = sb.charAt(i);
            char d = sb.charAt(i-1);
            int n =(int)c ;
            int g = (int)d;
             n = n-g;
             s = s + n +c;




        }
        return s;

    }
    public static void main(String[] args) {
        //A' is 65
        //a 97
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(toggle(s));
    }
}
