package com.company.rough;

import java.util.Arrays;

public class Rough18 {
    public static void main(String[] args) {
        int[] nums = { 1 , 2, 3,4 , 5 , 6 , 7};
        reverse(nums , 0 , nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void  reverse(int[] nums, int i , int i1){
        if (i>=i1){
            return;
        }
        int temp = nums[i1];
        nums[i1]=nums[i];
        nums[i]= temp;
        System.out.println(nums[i]);
        reverse(nums , i+1 , i1-1);
    }
}
