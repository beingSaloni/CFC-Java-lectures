package com.company.recursionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PowerSet {
    public static void main(String[] args) {
        int[] num = {15, 22, 14, 26, 32, 9, 16, 8};
        powerSet(num ,0 ,"0" ,53);
    }

    private static void powerSet(int[] num, int i , String s ,int target) {
        if(i== num.length){

            int sum = 0;
            int count = 0;
            ArrayList n = new ArrayList<>();
            for (String retval: s.split(",")) {
                 n.add(Integer.parseInt(retval));
                sum = sum + Integer.parseInt(retval);
                count++;

            }

            if (sum==target){
                Collections.sort(n);
                for (int j = 1; j < n.size(); j++) {
                    System.out.print(n.get(j) + " ");

                }
                System.out.println();

            }
            return;
        }
        powerSet(num , i+1 ,s+ "," + String.valueOf(num[i]) ,target);
        powerSet(num , i+1 ,s ,target);

    }

}
