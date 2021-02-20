package com.company.lecture4;

public class PatternStream2 {
    public static void sideTriangle(int n){
        int row = 0 ;
        int rowmirror = 0 ;
        while(rowmirror < 2* n -1){
            int col = 0 ;
            int colmirror = 0 ;
            while(colmirror < 2*n - 1){
                if ((col+row) < n - 1){
                System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
                if (colmirror < n-1){
                    col++;
                }else{
                    col--;
                }

                colmirror++;
            }
            System.out.println("");
            if (rowmirror < n-1){
                row++;
            }else{
                row--;
            }
            rowmirror++ ;
            }
    }
    public static void main(String[] args) {
        sideTriangle(4);

    }
}
