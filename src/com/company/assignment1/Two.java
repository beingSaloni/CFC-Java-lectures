package com.company.assignment1;
import java.sql.SQLOutput;
import java.util.Scanner ;

public class Two {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter amount , rate and time");
        float  amount = s.nextFloat() ;
        float rate = s.nextFloat();
        float time = s.nextFloat();

        float si = (amount*rate*time) / 100 ;
        System.out.println("Simple interest is " + si);


    }
}
