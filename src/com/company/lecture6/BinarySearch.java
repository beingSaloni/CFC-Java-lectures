package com.company.lecture6;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 3 , 7 , 9 , 10 , 25};

        System.out.println(BinarySearch ( nums , 7));
    }
    public static int BinarySearch(int[] nums , int el){
        int lower = 0 ;
        int upper = nums.length ;
        int c = nums.length;

        while(c > 0 ){
        if (el == nums[(upper+lower)/2]){
            return  (upper+lower)/2 ;
        }
        else if (el>nums[(upper+lower)/2]){
            lower = (upper+lower)/2 ;

        }
        else if (el<nums[(upper+lower)/2]){
            upper = (upper+lower)/2 ;
        }
        c--;
        }
        return -1;

    }
}
