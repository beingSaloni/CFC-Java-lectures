package com.company.assignment2;

import java.util.Arrays;

public class Q12 {

    public static void evenOddsort (int[] arr){
       int i = 0 ;
       int j = 1;
       while(i < arr.length){
           if(arr[i]%2==0){
               i++;
           }
           if(arr[j]%2==0) {
               int t = arr[i];
               arr[i] = arr[j];
               arr[j] = t;
           }
           if(j== arr.length-1){
               i = arr.length;
               break;
           }
           j++;
           }
       }

    public static void main(String[] args) {
        int [] arr = { 1 , 2 , 3, 4 , 5, 6 , 7 ,8 ,9 , 10};
        evenOddsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
