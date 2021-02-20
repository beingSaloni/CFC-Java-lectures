package com.company.assignment2;

import java.util.Scanner;

import static com.company.assignment2.Q9.isprime;

public class Q9 {
    public static boolean isprime(int n){
        if(n==2 || n==1){
            return false;
        }
        for (int i = 2; i*i > n  ; i++) {
            if(n%i==0){
                return false;
            }

        }
        return true;

    }
    public static int countPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int num = sc.nextInt();
        int[] arr = new int[num];
        num = 0 ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(isprime(arr[i]) == true){
                num++ ;
            }

        }
        return num ;
    }
    public static void main(String[] args) {

        System.out.println(countPrime());
    }
}
