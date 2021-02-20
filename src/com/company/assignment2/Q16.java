package com.company.assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q16 {

    public static void main(String[] args) {
        int arr[] = {1 , 2, 3};
        subset( arr , 0 , 3);

    }
    public static void subset(int[] arr, int r , int l){

        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("{");
            for (int j = 0; j < i; j++) {

//                list.add(arr[j]);
//                subset(arr );
                System.out.print(arr[j]);

            }

            System.out.println("}");

        }

    }
}