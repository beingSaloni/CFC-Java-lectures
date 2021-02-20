package com.company.lecture10;

public class Pattern {
    public static void pattern(int n , int p){
        if(n==0){
            return;
        }else if(n == p){
            System.out.println("");
            pattern(--n ,0);
            return;
        }else {System.out.print("* ");
        pattern( n , ++p);
    }}
    public static void main(String[] args) {
        pattern(5 , 0);
    }
}
