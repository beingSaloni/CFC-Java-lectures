package com.company.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println(sep(s ,0 ,arrayList));

    }

    private static String sep(String s, int start, ArrayList arrayList) {
        if(start>=s.length()-1){
            arrayList.add(s.charAt(start));
            String st ="";
             st = arr(st , 0 ,arrayList);
            return st ;
        }
        arrayList.add(s.charAt(start));
        if(s.charAt(start)==s.charAt(start+1)){
            arrayList.add(start+1 , "-");

        }
        return sep(s , start +1, arrayList);
    }
    public static String arr(String st , int start , ArrayList ar){
        if(start==ar.toArray().length){
            return st;
        }
        st = st + ar.get(start);
        return arr(st , start+1 , ar);

    }
}
