package com.company.assignment4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        String s = " “[a + {b +  (c+d) + e} + f";
        ArrayList<String> list = new ArrayList<>();
        System.out.println(balanceOrNot(s , 0 ,list));
        System.out.println(list.size());




    }

    private static boolean balanceOrNot(String s, int i ,ArrayList list) {
        if(i==s.length()){
            if(list.contains("[") || list.contains("(") || list.contains("{" )) {
                return false;
            }
            return true;
        }
        String check = "" + s.charAt(i);
        if(check.equals("[") || check.equals("(") || check.equals("{")){

            list.add(check);
            return balanceOrNot(s , i+1 , list);
        }else if(check.equals("]")){
            if(list.get(list.size()-1).equals("[")){

                list.remove(list.size()-1);
                return balanceOrNot(s , i+1 , list);
            }else {
                return false;
            }
        }else if(check.equals("}")){
            if(list.get(list.size()-1).equals("{")){
                list.remove(list.size()-1);
                return balanceOrNot(s , i+1 , list);
            }else {
                return false;
            }

        }else if(check.equals(")")){
            if(list.get(list.size()-1).equals("(")){

                list.remove(list.size()-1);
                return balanceOrNot(s , i+1 , list);
            }else {
                return false;
            }
        }else {

            return balanceOrNot(s , i+1 , list);

        }

    }
}
