package com.company.lecture5;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {

        decimal();

    }

    public  static  void decimal() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int decimal = 0 ;
        int place = 1 ;
        while (num>0){
            int rem = num%2 ;
            num/=2 ;
            decimal = rem*place + decimal ;
            place*=10 ;

        }
        System.out.println(decimal);

    }
}
