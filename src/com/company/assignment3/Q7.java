package com.company.assignment3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
// 0,1 1,3 2,1 3,4 4,5

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = i;

        }
        //1 3 1 4 5
        System.out.println(Arrays.deepToString(arr));
        for(int i = 0 ; i<n ;i++){
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j][0] > arr[j+1][0]){
                    int t = arr[j][0];
                    arr[j][0] = arr[j+1][0];
                    arr[j+1][0] =t;
                    t = arr[j][1];
                    arr[j][1] = arr[j+1][1]  ;
                    arr[j+1][1] = t;

                }
                
            }
        }
        System.out.println(Arrays.deepToString(arr));
        

        int z = arr.length-k-1;
        for (int i = z ;i < arr.length ; i++) {
            for (int j = z ;j < arr.length -i ; j++) {
                if(arr[j][1]>arr[j+1][1]){
                    int t = arr[j][1];
                    arr[j][1] = arr[j+1][1];
                    arr[j+1][1] = t;
                    t = arr[j][0];
                    arr[j][0] =arr[j+1][0];
                    arr[j+1][0] = t;
                }
                System.out.println(Arrays.deepToString(arr));

            }
        }
        for (int j = k-1; j < arr.length ; j++) {
            System.out.print(arr[j][0] + " ");

        }

    }
}
