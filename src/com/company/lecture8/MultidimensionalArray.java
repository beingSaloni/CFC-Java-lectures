package com.company.lecture8;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] nums = new int[5][];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i +1];

        }
        System.out.println(Arrays.deepToString(nums));
    }
}
