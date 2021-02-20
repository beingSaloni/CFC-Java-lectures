package com.company.assignment3;

import java.util.Scanner;

public class Q11 {
    public static String toggle(String s){
        StringBuilder sb = new StringBuilder(s);
        s ="";
        for (int i = 0; i < sb.length(); i++) {

                char c = sb.charAt(i);
                int n =(int)c ;
                if(n > 96){
                    n = n-32;
                    c = (char)n;
                    s = s + c;
                } else {

                 n =n + 32;
                c = (char)n;
                s = s + c;

            }


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
