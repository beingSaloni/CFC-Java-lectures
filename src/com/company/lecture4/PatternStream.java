package com.company.lecture4;

public class PatternStream {
    public static void downTriangle(int n) {
        int row = 0 ;
        int rowmirror = 0 ;

        while (rowmirror < 2*n - 1){
            int col = 0 ;
            while (col<n-row ){
                System.out.print((row + col + 1) +" ");
                col++ ;
            }
            System.out.println();
            if(rowmirror< n-1){
                row++ ;
            }else{
                row-- ;
            }
            rowmirror++ ;
        }}

    public static void main(String[] args) {
        downTriangle(5);
    }
}
