package com.company.lecture6;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {2 , 9 ,3 , 0 ,77 , 7 , 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public  static  void swap(int[] arr , int j , int k){
        int temp = arr[k] ;
        arr[k]= arr[j] ;
        arr[j] = temp ;
    }
    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if(arr[j]<arr[j+1]){
                    swap(arr, j , j+1);
                }

            }

        }

    }

}
