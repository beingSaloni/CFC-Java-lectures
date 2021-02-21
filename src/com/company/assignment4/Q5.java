package com.company.assignment4;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        char[] c= { 's', 'a', 'l' , 'o' ,'n' , 'i'};
        reverse(c , 0 , c.length-1);
        System.out.println(Arrays.toString(c));
    }

    private static void reverse(char[] c, int start, int end) {
        if(end <=start){
            return ;
        }
        char t = c[start];
        c[start]= c[end];
        c[end]= t;
        reverse(c , start+1 , end-1);
        return;
    }
}
