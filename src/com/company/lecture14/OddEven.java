package com.company.lecture14;

public class OddEven {
    public static void main(String[] args) {
        int n = 13 ;
        System.out.println(checkOdd(n));
    }

    private static boolean checkOdd(int n) {
        return (n&1)==1 ;

    }
}
