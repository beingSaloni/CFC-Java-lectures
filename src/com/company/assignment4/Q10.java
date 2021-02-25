package com.company.assignment4;

public class Q10 {
    public static void main(String[] args) {
        String s = "AXAX";
        int count=0;
        System.out.println(twin(s ,0 ,count));
    }

    private static int twin(String s, int start , int count) {
        if(start==s.length()-2){
            return count;
        }
        if(s.charAt(start)==s.charAt(start+2) && s.charAt(start)!=s.charAt(start+1)){
            count++;
        }
        return twin(s , start+1 ,count);


    }
}
