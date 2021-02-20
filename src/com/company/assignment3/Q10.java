package com.company.assignment3;

import java.util.Scanner;


public class Q10 {
    public static String replace(String s){
        StringBuilder sb = new StringBuilder(s);
        s ="";
        for (int i = 0; i < sb.length(); i++) {
            if(i%2==0){
                char c = sb.charAt(i);
                int n =(int)c + 1;
                c = (char)n;
                s = s + c;

            }else {
                char c = sb.charAt(i);
                int n =(int)c - 1;
                c = (char)n;
                s = s + c;

            }


        }
        return s;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(replace(s));
    }
}
