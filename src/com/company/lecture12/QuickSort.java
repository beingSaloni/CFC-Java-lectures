package com.company.lecture12;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr , int start , int end ){
        if(start>=end){
            return ;
        }
        int pos = pivot(arr , start, end);


        quickSort(arr , start , pos-1);
        quickSort(arr, pos + 1 , end);


    }
    public static void main(String[] args) {
        int [] arr = {6 , 0, 1 , 3,7 ,4,2};
        quickSort(arr , 0 , arr.length-1 );
        System.out.println(Arrays.toString(arr));

    }
    private  static  int pivot(int[] arr , int start , int end){
        int ind = start;
        for (int i = start; i < end; i++) {
            if(arr[i] < arr[end]){
                swap(arr , ind , i);
                ind++;
            }

        }
        swap(arr , ind , end);
        return ind;
    }
    public static void swap(int[] nums , int i , int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
