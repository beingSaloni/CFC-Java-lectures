package com.company.assignment3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        int t = n-k;
        for (int i = t; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
