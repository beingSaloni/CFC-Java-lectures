package com.company.lecture9;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPallindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;

            }


        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(isPallindrome(str));





    }
}
