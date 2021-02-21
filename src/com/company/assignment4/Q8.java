package com.company.assignment4;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] n = {10 , 9 ,8 ,8 ,0 ,5 ,6 ,11};

        selectionSort(n , n.length-1);
        System.out.println(Arrays.toString(n));
    }
    private static void selectionSort(int[] n, int end) {
        if(end < 0){
            return;
        }

         pass(n ,  end ,0  , 0);
        selectionSort(n , end-1);
        return;


    }
    private static void pass(int[] n, int end , int start , int maxIndex) {
        if(start > end ){
            int t = n[maxIndex];
            n[maxIndex] =n[end];
            n[end] = t;
            return ;
        }
        if(n[maxIndex] < n[start]){
            maxIndex = start;
        }
        pass(n , end , start+1 ,maxIndex);

    }
}
