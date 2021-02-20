package com.company.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int [] arr2 = new int[n];
        for (int i = 0; i < n ; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();

        }
        ArrayList<Integer> index = new ArrayList<>();
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(index.contains(j)){
                    continue;
                }else{
                    if (arr1[i] == arr2[j]){
                        System.out.print(arr1[i] + ", ");
                        index.add(j);
                        break;
                    }
                }

            }

        }
        System.out.print("}");

    }
}
