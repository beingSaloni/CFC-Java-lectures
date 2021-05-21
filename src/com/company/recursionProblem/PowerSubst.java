package com.company.recursionProblem;

public class PowerSubst {
    public static void main(String[] args) {

        String s = "ab";
    powerSet(s , 0 ,"");
}

    private static void powerSet(String s, int i, String cur) {
        if(i==s.length()){
            System.out.println("{" + cur + "}");
            return;
        }
        powerSet(s , i+1 ,cur+ s.charAt(i));
        powerSet(s , i+1 ,cur);
    }
}
