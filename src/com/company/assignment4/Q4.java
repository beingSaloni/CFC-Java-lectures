package com.company.assignment4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        int[] arr =   {0, 4, 2, 2, 1, 2, 3, 4, 2};
        ArrayList<Integer> col = new ArrayList<>();
        System.out.println(Arrays.toString(search(arr , 2 , 0 ,col)));


    }

    private static Object[] search(int[] arr, int i, int start , ArrayList col) {
        if(start== arr.length){
            Object[] array = col.toArray();
            return array;
        }
        if(arr[start] == i){
            col.add(start);
        }
        return search(arr,i , start+1, col);

    }

}
