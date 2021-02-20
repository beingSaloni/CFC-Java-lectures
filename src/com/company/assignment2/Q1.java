package com.company.assignment2;

public class Q1 {
    public static int digitlength(int f){
       int num = 0 ;
       while (f>0){
           f=f/10 ;
           num++;
       }
       return num ;
    }
    public static void decimalToOctal(int f){
        int[] arr = new int[digitlength(f)];
        int i = 1 ;
        while (f>0){
           int r = f % 8;
            f = f/8;
            arr[digitlength(f)] = r ;
            i++ ;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);

        }


    }
    public static void main(String[] args) {
     decimalToOctal(453);

    }
}
