package com.company.lecture6;

public class LinearSearching {
    public static void main(String[] args) {
        int[] nums = { 3 , 7 , 9 , 0 , 5};
        System.out.println(linearSearch(nums,5));
    }

    public static int linearSearch(int[] nums , int el){
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==el){
                return i ;
            }

        }
        return -1 ;
    }
}

