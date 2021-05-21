package com.company.lecture16;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] nums  ={9 , 8 ,-1 ,3 ,-1 ,8};
        int k =3;

       slidingWindow(nums,k,0,0);

    }

    private static void slidingWindow(int[] nums, int k ,int initial,int sum ) {
        if(initial+k-1==nums.length){
            return ;
        }
        if(initial==0) {
            for (int i = initial; i < initial + k; i++) {
                sum=sum +nums[i];
            }

        }else {
            sum = sum +nums[initial+k-1] -nums[initial-1];
        }
        System.out.println(sum);
        slidingWindow(nums,k,initial+1,sum);
    }
}
