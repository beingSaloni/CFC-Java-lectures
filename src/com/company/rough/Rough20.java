//package com.company.rough;
//
//public class Rough20 {
//    public static void main(String[] args) {
//        reverseOnlyLetters("SA-loni=");
//    }
//
//    public static String reverseOnlyLetters(String S) {
//        int count = 0;
//        for(int i = 0 ; i < S.length()/2 ;i++ ){
//            int n = (int)S.charAt(i);
//            char r = (char)S.charAt(i);
//
//            if((n>=65 && n <=90) || (n>=95 && n <=122)){
//                char c = S.charAt(i);
//                S.charAt(i) = S.charAt(S.length()-1-count);
//                S.charAt(S.length()-1-count) = c;
//                count++;
//            }
//        }
//        System.out.println(S);
//        return S;
//    }
//}
