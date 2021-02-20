package com.company.lecture7;

import java.util.Arrays;

public class InsertionSort {
    public static void inserstion(int[]arr){
        int k ;
        for (int i = 0; i < arr.length -1; i++) {
            k = arr[i] ;
            for (int j = i -1 ; j < 0 ; j--) {
                if (arr[j] <k){
                    arr[j+1] = arr[j];
                    arr[j + 1]= k ;
                }
                
            }
            
        }
        System.out.println(Arrays.toString(arr));



    }
    public static void main(String[] args) {
        int [] arr = {0 , 9 , 7 , 9 , 4 , 0 , 99 , 55};
        inserstion(arr);
    }
}
