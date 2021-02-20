package com.company.lecture9;

public class Fibo {
    public  static int fibb (int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }

        return (fibb(num-2) + fibb(num-1));
    }
    public static void main(String[] args) {
        System.out.println( fibb(6 ));


    }
}
