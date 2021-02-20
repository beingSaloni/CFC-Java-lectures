package com.company.lecture9;

public class LinearSearch {
    public  static int linearsearch(int[] num , int ta , int ind){
        if(ind == num.length){
            return -1;
        }
        if(num[ind]==ta){
            return  ind;
        }else {
            return linearsearch(num , ta ,++ind);
        }

    }
    public static void main(String[] args) {
        int[] arr = {0 , 1 , 8 , 9 ,10 , 99};
        System.out.println(linearsearch(arr , 9 , 0));


    }
}
