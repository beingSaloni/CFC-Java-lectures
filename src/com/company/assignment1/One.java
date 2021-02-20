package com.company.assignment1;
import java.sql.SQLOutput;
import java.util.Scanner ;

public class One {
    public  static  void main(String [] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the credits :- ");
        int credits = s.nextInt();
        if (7500 <= credits){
            System.out.println("Tera leader");
        }
        else if (6000 <= credits){
            System.out.println("Gega leader");
        }
        else if (4500 <= credits){
            System.out.println("Mega leader");
        }
        else if( credits < 4500){
            System.out.println("Rising Star");
        }
    }
}
