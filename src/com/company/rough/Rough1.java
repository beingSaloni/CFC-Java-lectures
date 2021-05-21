package com.company.rough;
import java.util.Arrays;
import java.util.Scanner ;

public class Rough1 {
    public static void main(String[] args) {
        int[] num1 = {1,10 ,99 ,333};
        int[] num2 = {22,39,90};
        int[] ans = new int[8];

        int point1 = 0;
        int point2=0;
        merge(num1,num2,point1,point2);

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        int k=0;
//        while(point1<num1.length&&point2<num2.length)
//        {
//            if(num1[point1]<num2[point2])
//            {
//                ans[k++]=num1[point1];
//                point1++;
//            }
//            else if(num2[point2]<num1[point1])
//            {
//                ans[k++]=num2[point2];
//                point2++;
//            }
//
//
//        }
//        //System.out.println(point2);
//        while(point1< num1.length)
//        {
//            ans[k++]=num1[point1];
//            point1++;
//        }

//        System.out.println(Arrays.toString(ans));
    }

    private static void merge(int[] num1, int[] num2, int point1, int point2) {
        while(point1<num1.length&&point2< num2.length)
        {
            if(num1[point1]<num2[point2])
            {
                point1++;
            }
            else if(num2[point2]<num1[point1])
            {
//                {1,4,7,8,10};
//                {2,3,9};

                    int temp = num1[point1];
                    num1[point1] = num2[point2];

                    point1++;

                  int k = point2;
                  if(k < num2.length-1){
                while (num2[k+1] < temp){
                    num2[k] = num2[k+1];
                    k++;
                    if(k == num2.length-1){
                        break;
                    }

            }}
                num2[k] = temp;
            }



        }
}}
