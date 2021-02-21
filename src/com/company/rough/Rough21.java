package com.company.rough;

public class Rough21 {
    public static int rob(int[] nums) {
        int i = 0;
        int max =0;
        while(i<nums.length){

            if(i+1 > nums.length-1){
                max = max + nums[i];
                break;
            }
            if(i+2 > nums.length-1){
                max= max +(nums[i] >nums[i+1] ? nums[i] : nums[i+1]);
                continue;
            }
            if(i+3 > nums.length-1){
                max= nums[i] + nums[i+2];
                continue;

            }

            if(nums[i] + nums[i+2] > nums[i+1] + nums[i+3]){
                if(nums[i] + nums[i+2] > nums[i]+nums[i+3] ){
                    max = nums[i] + nums[i+2];
                    i=i+4;
                }else{
                    max = nums[i]+nums[i+3];
                    i = i+5;
                }
            }else{
                if(nums[i+1] + nums[i+3]>nums[i]+nums[i+3]){
                    max = nums[i+1] + nums[i+3];
                    i=i+5;
                }else{
                    max = nums[i]+nums[i+3];
                    i = i+5;

                }
            }


        }
        return max;
    }

    public static void main(String[] args) {
       int[] arr = {2,7,9,3,1};
        System.out.println( rob(arr));


    }
}
