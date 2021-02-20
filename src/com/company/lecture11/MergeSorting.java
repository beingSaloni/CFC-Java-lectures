package com.company.lecture11;

import java.util.Arrays;

public class MergeSorting {
    public static int [] mergeSort(int [] arr1 , int [] arr2){
        int n = arr1.length + arr2.length;
        int arr3[] = new int[n];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(j < n) {
            if(i== arr1.length ){
                arr3[j] = arr2[k];
                ++k;
            }else if(k== arr2.length){
                arr3[j] =arr1[i];
                ++i;
            }
            else{

                if(arr1[i]<= arr2[k]){
                    arr3[j] = arr1[i];
                    ++i;
                }else {
                    arr3[j] = arr2[k];
                    ++k;
                }}
            ++j;

        }
        return arr3;

    }
    public static int[] mergeSorting(int[] arr ){
        if(arr.length < 2){
            return arr;
        }
        int mid = arr.length/2;
        int [] first = Arrays.copyOfRange(arr,0 ,mid);
        int [] second = Arrays.copyOfRange(arr , mid , arr.length);
        first = mergeSorting(first);
        second = mergeSorting(second);
         return mergeSort(first, second);

    }
    public static void main(String[] args) {
        int [] arr = { 1 , 8 , 0 , 2 , 9 , 10 , 17 , 10 , 13 , 19 };
        System.out.println(Arrays.toString(mergeSorting(arr)));

    }
}
