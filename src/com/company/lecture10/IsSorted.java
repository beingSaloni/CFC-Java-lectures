package com.company.lecture10;

public class IsSorted {
    public  static  boolean isSorted(int[]arr , int index){
        if(index == arr.length -1){
            return true;
        }

        if(arr[index] < arr[index +1]){
                return isSorted(arr , ++index);

        }
        return false;

    }
    public static void main(String[] args) {
        int [] arr = {2 , 3 , 4 , 7, 9 , 40};
        System.out.println(isSorted(arr, 0));

    }
}
