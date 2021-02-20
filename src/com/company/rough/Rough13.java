package com.company.rough;
import java.util.Arrays;
public class Rough13 {
          public static void main(String[] args) {
            int [] n = {3,4,6,7,8,10};
            bubbleSort(n);
            System.out.println(Arrays.toString(n));
        }

        private static void bubbleSort(int[] n){
            int c =0;
            for(int i = 0; i<n.length;i++){
                for(int j =0;j<n.length-i-1;j++){
                    if(n[j]%2 == 0){
                        c++;
                        swap(n,i,j+1);
                    }
                }
            }
        }
        private static void swap(int[] n,int i,int j){
            int t = n[i];
            n[i] = n[j];
            n[i] = t;
        }
    }





