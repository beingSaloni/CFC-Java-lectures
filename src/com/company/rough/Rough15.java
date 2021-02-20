package com.company.rough;

import java.util.Arrays;

public class Rough15 {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0 ;
        int i = 0 ;
        int j = 1 ;
        int k = 2;

        while (i < arr.length){
            if(k >= arr.length ){
                if(j <= arr.length -1){
                    j++;
                    k =j+1;
                    continue;
                }
                ++i ;
                j = i + 1;
                k = j + 1;
                continue;
            }
            int e = arr[i] - arr[j];
            if(e < 0) e = e*-1;
            if(e<=a){
                int d = arr[j] - arr[k];
                if(d < 0) d = d*-1;
                if(d<=b){
                    int z = arr[k] - arr[i];
                    if(z < 0) z = z *-1;
                    if(z<=c){
                        System.out.println(arr[i] + arr[j] + arr[k] );
                        ++count;

                        k++;

                        continue;
                    }else {
                        ++k;
                        continue;
                    }
                }else{
                    if(k< arr.length){
                        ++k;
                        continue;
                    }
                    ++j;
                    k = j + 1;
                    continue;
                }

            }else {
                ++i;
                j = i + 1;
                k = j + 1;
            }

        }

       return count;
    }

    public static void main(String[] args) {
        int prices[] = {7,3,7,3,12,1,12,2,3};
       int c = countGoodTriplets(prices ,  5 , 8 , 1);
        System.out.println(c);
    }
}
