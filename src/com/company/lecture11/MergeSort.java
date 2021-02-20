package com.company.lecture11;

import java.util.Arrays;

public class MergeSort {
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
    public static void main(String[] args) {
        int arr1 [] = { 1 , 3 , 3 , 10};
        int arr2 [] ={ 0, 2, 4 , 12};
        System.out.println(Arrays.toString(mergeSort(arr1 , arr2)));
    }
}
