package com.company.lecture14;

public class TwoNumber {
    public static void main(String[] args) {
        int nums [] = { 1 ,2 ,3 ,4,5,5,2,1};
        numsAre(nums);
    }

    private static void numsAre(int[] nums) {
        int xor = uniqueOne(nums);
        int pos = 0;
        while ((xor & 1) !=1){
            pos++;
            xor = xor >>1 ;

        }
        int mask = 1 << pos ;
        int first =0 , second ;
        for (int num : nums){
            if((num & mask) >= 1){
                first = first ^ num ;
            }
        }
        second = uniqueOne(nums) ^ first;
        System.out.println(first + " " + second);



    }
    private  static int uniqueOne(int[] n) {
        int result = 0;
        for (int i :n) {
            result = result ^ i;

        }
        return result;
    }
}
