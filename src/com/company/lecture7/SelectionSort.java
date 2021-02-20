package com.company.lecture7;

import java.util.Arrays;

public class SelectionSort {

    public  static  void selectionSort(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i ;
            for (int j = i; j < arr.length  ; j++) {
                if (arr[j] < arr[min]){
                    min = j ;
                }
            }
            int t = arr[min];

            arr[min] = arr[i];
            arr[i] = t ;
        }

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int [] arr = {0 , 9 , 7 , 9 , 4 , 0 , 99 , 55};
        selectionSort(arr);

    }
}
