package com.company.lecture10;


public class StringRecursion2 {

    public  static  String swap(String s , int r , int i){
        char array[] = s.toCharArray();
        char t = array[r];
        array[r]= array[i];
        array[i] = t ;
        return String.valueOf(array);
    }
    public static void permutation(String s , int r , int l , int c){

        if(l-1==r){
            System.out.print(c + " ");
            System.out.println(s);

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
        permutation("abc" , 0 , 3 ,c);

    }
}
