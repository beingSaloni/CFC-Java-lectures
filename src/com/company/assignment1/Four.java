package com.company.assignment1;

public class Four {
    public static void main(String[] args){
        int n = 10 ;
        int i = 0 ;
        int j = 1;
        while (n > 0){
            i+= 2 ;
            System.out.print(i + " ");
            i+=j*2 ;
            j+=2 ;
            n--;
        }
    }

}
