package com.company.assignment3;

public class Q13 {
    public static int count( StringBuilder sb){
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            String s = "" +sb.charAt(i);
            if(s.equals("a")){
                count++;
            }

        }
        count = count>sb.length()-count?count:sb.length()-count;

        return count +2;

    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abbab");
        System.out.println(count(sb));
    }
}
