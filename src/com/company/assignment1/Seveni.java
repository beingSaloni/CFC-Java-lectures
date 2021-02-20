package com.company.assignment1;
public class Seveni {
    public static  void pattern(int n){
        int row = 0 ;
        int rowmirror = 0;
        while (rowmirror < 2*n -1){
            int col = 0 ;
            int colmirr = 0 ;
            while (colmirr<2*n-1){
                if(col<row){
                    System.out.print(n-col);
                }else {
                    System.out.print(n - row);
                }
                if (colmirr >= n-1){
                    col--;
                }else {
                    col++ ;
                }
                colmirr++ ;
            }
            System.out.println();
            if (rowmirror >= n-1){
                row--;
            }else {
                row++ ;
            }
            rowmirror++ ;
    }}
    public  static void main(String[] args){
        pattern(5);
    }
}
