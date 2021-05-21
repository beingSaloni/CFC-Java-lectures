package com.company.rough;

import java.util.Arrays;
import java.util.Scanner;

public class rough27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        while(n> 0){
           int t = sc.nextInt();
            int[] arr = new int[t];
            while(t >0){
                arr[t-1] = sc.nextInt();
                t--;
            }
            Arrays.sort(arr);

            int c = 1;
            int sum = 1;
            System.out.println(Arrays.toString(arr));

            while (t< arr.length-1){
                if(arr[t] != arr[t+1]){
                    c++;
                }
               sum = sum + c;
                t++;
//                System.out.println(sum);
            }
            System.out.println(sum);
           n--;
        }
    }
}
