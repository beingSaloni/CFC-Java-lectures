package com.company.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] alaphabets = new char[5];
        for (int i = 0; i < alaphabets.length-1; i++) {
            alaphabets[i] =s.next().charAt(0);

        }

        alaphabets[4]='u';
        System.out.println(alaphabets);
        System.out.println(Arrays.toString(alaphabets));

        int [] nums = {1 ,2,3 ,4 ,5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);

        }

    }
}
