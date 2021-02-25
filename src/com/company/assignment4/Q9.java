package com.company.assignment4;

public class Q9 {
    public static void main(String[] args) {
        String s =  "abbabbb";
        if(s.charAt(0)=='a'){
            System.out.println(check(s ,1));
        }else{
            System.out.println(false);
        }

    }

    private static boolean check(String s, int start) {
        if(start==s.length()){
            return true;
        }


        if(s.charAt(start)== 'a'){
            return check(s , start+1);
        }else if(s.charAt(start)=='b' ){
            if(s.length()-1< (start +1)){
                return  false;
            }
            if(s.charAt(start+1) =='b' ){
                if(s.length() -1 >= start+2){
                   if(s.charAt(start+2)=='a'){
                       return check(s ,start+3);

                   }else {
                       return false;
                   }
                }
                return check(s ,start+2);
            }else {
                return false;
            }

        }
            return false;


    }

}
