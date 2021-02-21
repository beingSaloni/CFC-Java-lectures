package com.company.assignment4;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = { 2 , 5 , 4 ,1 ,3};
        int[] copy = new int[arr.length];
        inverse(arr, 1 ,copy);
        System.out.println(Arrays.toString(copy));
    }

    private static void inverse(int[] arr, int i , int[]copy) {
        if(i== arr.length+1){
            return;
        }
        copy[arr[i-1]-1] = i;
        inverse(arr, i+1 , copy);
        return;
    }
}
