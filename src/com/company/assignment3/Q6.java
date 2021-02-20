package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static int[] sum( int[] arr1 , int[] arr2  ){
        int l = arr1.length > arr2.length ? arr2.length : arr1.length;
        int[] arr = new int[ l +1];
        int sum = 0;
        for (int i = l-1; i >= 0 ; i--) {
            sum = arr1[i] + arr2[i] + sum;
            if(sum > 9){
                sum= sum%10;
                arr[i+1] = sum ;
                sum = 1;
            }else {
                arr[i +1] = sum ;
                sum = 0;

            }
        }
        arr[0] = sum ;
        return arr ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int arr2[] = new int[b];
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }


        int[] arr = sum(arr1 , arr2);
        System.out.println(Arrays.toString(arr));

    }
}
