package com.company.assignment1;
import java.util.Scanner;
public class rough {


    public static  void main(String[] args){
        pattern(5);

}

    private static void pattern(int n) {
        int i =1;
        int c = 1;
        int s =0;
        while (i<=n){
            int j =0;
            while (j<i){
                if(j==0) {
                    s = s + i;
                }
                if(i%2==0){
                    System.out.print(s-j );

                }else {
                    System.out.print(c );
                }
                if(j!=i-1){
                    System.out.print("*");
                }
                c++;
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
