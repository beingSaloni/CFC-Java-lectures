package com.company.rough;

public class Rough5 {
    public static  void pattern(int n){
            int row = 0 ;

            while (row < n ){
                int col = 0 ;
                int colmirr = 0 ;

                while (colmirr<2*n-1){

                    if(col>=n-row-1){

                        System.out.print(col + 2 - n + row +row + " " );
                    }else {
                        System.out.print("  ");
                    }
                    if (colmirr >= n-1){
                        col--;
                    }else {
                        col++ ;
                    }
                    colmirr++ ;
                }
                System.out.println();
                row++;

            }}
        public static void main(String[] args) {
            pattern(5);

        }


}
