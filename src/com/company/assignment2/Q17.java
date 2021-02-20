package com.company.assignment2;

import java.util.Arrays;

public class Q17 {

    public  static  int[] swap(int[] s , int r , int i){

        int t = s[r];
        s[r]= s[i];
        s[i] = t ;
        return s;
    }
    public static void permutation(int[]s , int r , int l , int c){

        if(l-1==r){
            System.out.print(c + " ");
            System.out.println(Arrays.toString(s));

            return;
        }
        for (int i = r; i < l; i++) {
            c++;

            s= swap(s , r , i);
            permutation(s , r+1 , l , c);
            s= swap(s,r,i);

        }
    }
    public static void main(String[] args) {
        int c = 0 ;
        int s[] = {7 , 2 ,6};
        permutation(s, 0 , 3 ,c);

    }
}
