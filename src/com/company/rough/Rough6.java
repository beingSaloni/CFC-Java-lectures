package com.company.rough;
import java.util.Arrays;
import java.util.Scanner;
public class Rough6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num ,a ;
    num= sc.nextInt();//for number of test cases
    int temp = num-1;
    int [] store = new int[num];
        while(num>0){
        a = sc.nextInt(); // first line of input
        int [] arr = new int[a] ;
        int sol = 0 ;
        for(int i =  0; i < a ; i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        sol = arr[a-1] - arr[0];

        int t = sol ;

        for(int i = 1 ; i < a -1 ; i++){
            int m = t - arr[i] ;
            sol = sol - arr[1];
            if (m < 0) {
                m = m*-1 ;
            }
            if(sol < m ){
                sol = m ;
            }
        }
        store[num - 1]= sol;

        num-- ;
    }
        for (int i = temp; i >= 0; i--) {
        System.out.println(store[i]);

    }


}


}

