package com.company.lecture10;

public class Pattern2 {
    public static void pattern(int row , int col){
        if(row==0){
            return;
        }else if(row == col){

            pattern(--row ,0);
            if(row >= 1) {
                System.out.println("");
            }
            return;
        }else {
            pattern( row , ++col);
            System.out.print("* ");

        }}
    public static void main(String[] args) {
        pattern(5 , 0);
    }
}
