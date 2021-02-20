package com.company.rough;
import java.util.Scanner;
import java.util.Arrays;

public class rough7 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long b, a, num;
            num = sc.nextLong();
            while(num-- !=0){
                b = sc.nextLong();
                long[] arr = new long[(int)b];
                for (int i = 0; i < (int)b; i++){

                    arr[i]=sc.nextInt();
                }
                Arrays.sort(arr);
                a = 2*(arr[0]-arr[0]);
                System.out.println(a);

        }
    }
}
