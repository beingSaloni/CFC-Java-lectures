package com.company.lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilder {
    public StringBuilder(String nextLine) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Ekta";
        StringBuilder[] sb = new StringBuilder[5];
        System.out.println(Arrays.toString(sb));
        for (int i = 0; i < 5; i++) {
            sb[i] = new StringBuilder(String.valueOf(i));
        }
        System.out.println(Arrays.toString(sb));

    }
}
