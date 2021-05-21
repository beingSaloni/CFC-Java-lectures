package com.company.assignment1;

public class rough2 {
    public static  void main(String[] args){
        pattern(4);

    }

    private static void pattern(int n) {
        int i =1;

        int s =0;
        while (i<=n){
            int j =0;
            while (j<i){
                if(j==0) {
                    s = s + i;
                }
                    System.out.print(s-j + " ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
