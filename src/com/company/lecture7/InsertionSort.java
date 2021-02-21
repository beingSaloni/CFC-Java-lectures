package com.company.lecture7;

import java.util.Arrays;

public class InsertionSort {
    public static void inserstion(int[]arr){

        for (int i = 1; i < arr.length-1 ; i++) {


            for (int j = i   ; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int t =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= t;
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
