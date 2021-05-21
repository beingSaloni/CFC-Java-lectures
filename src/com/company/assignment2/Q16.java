package com.company.assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q16 {

    public static void main(String[] args) {
        int arr[] = {1 , 2, 3};
        subset( arr , 0 , "");
        System.out.println(post(arr,0));

    }

    private static ArrayList<String> post(int[] arr, int id) {
        if(id== arr.length){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String>uper = post(arr, id+1);
        int k = uper.size();
        for (int i = 0; i < k; i++) {
            uper.add(arr[id] + uper.get(i));

        }
        return uper;
    }

    //pre
    public static void subset(int[] arr, int r , String s){

        if(arr.length == r){

            System.out.println("[" + s + "]");
            return;

        }
        subset(arr, r+1 ,s);
        subset(arr, r+1, s + arr[r]);



    }
}