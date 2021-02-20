package com.company.assignment2;

import java.util.Scanner;

public class Q7 {
    public static int lcm(int a , int b){

        int num = a>b?a:b ;
        int p = 1 ;
        if(num%a == 0 && num%b == 0){
            return num ;
        }else{
            for (int i = 2; i < num  ; i++) {
                if(a%i==0 || b%i==0){
                    p*=i ;
                    if (a%i==0){
                        a/=i;
                    }
                    if(b%i==0){
                        b/=i;
                    }

                }

            }
            if(a==b && a>1){
                return p*a ;
            }
            if(a>1 ){
                p*=a ;
            }
            if (b>1){
                p*=b;
            }
            return p;

        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a , b));

    }
}
