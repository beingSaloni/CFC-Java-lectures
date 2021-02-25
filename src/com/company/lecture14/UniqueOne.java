package com.company.lecture14;

public class UniqueOne {
    public static void main(String[] args) {
        int[] n = { 2 , 3 ,4 ,5 ,6 ,7 ,6 ,5 ,4,3,2};
        System.out.println(uniqueOne(n));

    }

    private static int uniqueOne(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result = result ^ n[i];

        }
        return result;
    }
}
