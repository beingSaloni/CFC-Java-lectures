package com.company.rough;

public class Rough10 {
    public static void main(String[] args) {
        int [] arr = {7 , 6 , 8 , 6};
        int sum = 0 ;
        int t = 0;
        for(int i = 0 ; i<arr.length ;i++){
            int n = 0 ;
            if(i%2==1 )
//
//            int n = arr.length%2==0?(arr.length/2):((int)(arr.length/2) + 1);
            System.out.println(arr[i]*(n+ t));
            sum = sum + arr[i]*(n+ t);

            if(i>= n-1 && i > 0 && arr.length !=3 && t!=0){
                t--;
            }else if(i<n-1 && arr.length != 3){
                t++;
            }

        }
        System.out.println(sum);

    }
}
