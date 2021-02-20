package com.company.rough;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Rough8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[]arr = new String[n];
        //12:00 AM 11:42 PM
        while(n>0){
            String s = sc.next();

            int num = (((int)s.charAt(0))*1000) + (((int)s.charAt(1))*100) +(((int)s.charAt(3))*10) +((int)s.charAt(4));
            if(s.charAt(6)=='A'){
                num= num + 1200;
            }
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                String r = "";
                String s1 = sc.next();
                int num1 = ((int)s1.charAt(0)*1000) + ((int)s1.charAt(1)*100) +((int)s1.charAt(3)*10) +((int)s1.charAt(4));
                if(s1.charAt(6)=='P'){
                    num1= num1 + 1200;
                }
                int num2 = ((int)s1.charAt(9)*1000) + ((int)s1.charAt(10)*100) +((int)s1.charAt(12)*10) +((int)s1.charAt(13));
                if(s1.charAt(15)=='P'){
                    num2= num2 + 1200;
                }
                if (num>=num1 && num<= num2){
                    r = r +'1';
                }else {
                    r = r +'0';
                }
                arr[n-1]=r ;
            }

            n--;
        }
        for (int i = Array.getLength(arr) - 1; i < 0; i++) {
            System.out.println(arr[i]);

        }
    }
}
