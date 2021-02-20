package com.company.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("No. of elements:-");
        int num = sc.nextInt();
        int [] arr = new int[num];
        int count = 0 ;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%5==0){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
}
