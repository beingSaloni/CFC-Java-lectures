package com.company.lecture5;

public class Prime {
    public static void main(String[] args) {

        int num = 13 ;

        boolean res = prime(num);
        System.out.println(res);

    }
    public  static  boolean prime(int num){
        for (int i = 2 ;  i*i <= num ; i++){
            if (num%i==0){
                return false;
            }
        }
        return  true ;
    }


}
