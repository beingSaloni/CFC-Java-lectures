package com.company.assignment3;

import java.util.Scanner;

public class Q9 {
    public static int sum (int[] arr , int num ){
        int sum = 0 ;
        for (int i = 0; i <= arr.length-num; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i+1 ; j < num +i; j++) {
                if(arr[j]>max){
                    max = arr[j];
                }
                if (arr[j] < min){
                    min = arr[j];
                }

            }
            sum = sum + max + min;

        }

        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.println(sum(arr , num));

    }
}
