package com.company.assignment2;


import java.util.Arrays;

public class Q13 {
    public  static  void  reverse(String [] arr){
        for (int i = 0; i <= (int)arr.length/2 ; i++) {
            String t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1]=  t ;

        }
    }
    public static void main(String[] args) {
        String [] arr = { " Hi " , " Saloni " , " Sup ?" , " Howzz " , " Life ?" , "Bro "};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
