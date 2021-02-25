package com.company.lecture14;

public class BitwiseEx {
    public static void main(String[] args) {
        int n =17 ;
        System.out.println(countSetBits(n));
    }

    private static int countSetBits(int n) {
        int cnt = 0 ;

        while(n > 0){
            if((n &1) == 1){
                cnt++;

            }
            n = n>>1;
        }


        return cnt;
    }
}
