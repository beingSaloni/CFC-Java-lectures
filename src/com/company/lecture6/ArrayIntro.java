package com.company.lecture6;


import java.util.Scanner;

public class ArrayIntro {
    public static int max(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max=arr[i];
            }

        }
        return max ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =s.nextInt();

        }
        System.out.println(max(arr));
    }
}
