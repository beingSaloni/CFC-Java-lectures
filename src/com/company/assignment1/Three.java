package com.company.assignment1;
import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int gcd = (num1 > num2) ? num2 : num1;
        for (int i = gcd; i > 0 ; i--) {
            if((num1 % i == 0) && (num2% i ==0)){
                System.out.println("GCD is " + i);
                break;
            }

        }
        }
    }

