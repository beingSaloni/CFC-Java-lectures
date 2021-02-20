package com.company.assignment2;

import java.util.Arrays;

public class Q11 {
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public static  void countingsort(int[] arr){
        int max = max(arr);
        int [] arr2 = new int[max +1];
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            arr2[a]++;
        }
        int i , j ;
         i = j = 0 ;
        while (i <= max){
            if (arr2[i]>0){
                arr[j]= i ;
                arr2[i]--;
                j++;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 0 , 0 ,1 ,1 , 0 , 0 , 0 , 0 , 1 , 0 , 1 , 0 , 1 , 0};
        countingsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
