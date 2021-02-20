package com.company.rough;
import java.util.Arrays;
import java.util.Scanner;
public class Rough9 {

    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = 5;
            int ar[] = new int[10];

            System.out.println("Enter array elements");
            for (int i=0;i<n;i++){
                ar[i] = sc.nextInt();
            }

            System.out.println("Is Array Sorted :" +isSorted(ar));
            System.out.println(Arrays.toString(ar));
        }

        public static boolean isSorted(int[] a)
        {
            if(a == null) {
                return false;
            }
            else if(a.length == 0) {
                return true;
            }

            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]) {
                    return false;
                }
            }
            return true;
        }

}
