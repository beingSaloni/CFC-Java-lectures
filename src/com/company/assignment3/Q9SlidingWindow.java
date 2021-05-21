package com.company.assignment3;

public class Q9SlidingWindow {

    public static void main(String[] args) {
        int arr[] = {2 ,5 ,-1 ,7 ,-3 ,-1 ,-2};
        fun(arr ,4);
    }

    private static void fun(int[] arr , int k) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int ans[] = new int[arr.length-k+1];
        for(int i = 0 ; i< arr.length;i++){
            if(i%k==0) left[i]=arr[i];
            else left[i]= Math.max(left[i-1], arr[i]);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            if(i== arr.length-1 || (i+1)%k==0){

                right[i]= arr[i];

            }else {
                right[i] = Math.max(right[i+1] , arr[i]);
            }
        }
        int l =0 ;
        for (int i = k-1  ; i< arr.length; i++) {
            ans[l] = Math.max(left[i] , right[i-k+1]);
            l++;

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");

        }
        System.out.println();

    }
}
