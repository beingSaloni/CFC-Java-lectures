package com.company.rough;

import java.util.Arrays;
import java.util.ArrayList;

public class Rough12 {
    public static int[] addSpace (int[] target ,  int i , int[] index , int[] nums){
        if(i < target.length){
        if(target[index[i]] == 0){
            target[index[i]] = nums[i];
        }else{
            addSpace(target , ++i , index , nums);
        }


    } return target;
    }

    public static  int[] createTargetArray(int[] nums, int[] index) {

        int l = nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>(l);
        int[] res = new int[l];

        for(int i=0; i<l; i++){
            arr.add(index[i], nums[i]);
        }

        for(int i = 0; i<l; i++){
            res[i] = arr.get(i);
        }
        return res;
    }
    // [0,4,1,3,2]

    public static void main(String[] args) {
       int[] nums = {0,1,2,3,4};
       int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums , index)));
    }
}
