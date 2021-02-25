package com.company.assignment4;

public class Q13 {
    public static void main(String[] args) {
        String s = "hhhhelllloooooo";
        String copy = "" ;
        System.out.println(removeConsecutiveChar(s , 0 , copy));
    }

    private static String removeConsecutiveChar(String s, int i ,String copy) {
        if(i == s.length()-1){
            copy = copy + s.charAt(i);
            return  copy;
        }
        if(s.charAt(i) != s.charAt(i+1)){
            copy = copy + s.charAt(i);
        }
        return removeConsecutiveChar(s ,i+1 , copy);
    }
}
