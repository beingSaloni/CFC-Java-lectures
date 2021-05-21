package com.company.assignment4;

public class Q3 {
    public static void main(String[] args) {
        int[] arr =  {0, 4, 2, 2, 1, 2, 3, 4, 2};
        System.out.println(search(arr , 2 , arr.length-1));
    }

    private static int search(int[] arr, int i , int start) {
        if(start == -1){
            return -1;
        }
        if(arr[start] == i){
            return start;
        }else {
            return search(arr, i ,start-1 );

        }
    }
}

