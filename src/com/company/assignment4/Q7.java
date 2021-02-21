package com.company.assignment4;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] nums = { 10 , 9 , 8 ,7};
        bubblesort(nums, 0);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubblesort(int[] nums, int start) {
        if(start== nums.length-1){
            return;
        }

        pass(nums , 0);
        bubblesort(nums, start+1);

    }

    private static void pass(int[] nums, int p) {
        if (p == nums.length-1){

            return;
        }
        if(nums[p] > nums[p+1]){
            int t = nums[p];
            nums[p]= nums[p+1];
            nums[p+1]=t;
        }
        pass(nums, p+1);

    }
}
