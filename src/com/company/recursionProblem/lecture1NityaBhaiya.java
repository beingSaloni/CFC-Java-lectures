package com.company.recursionProblem;

import java.util.ArrayList;
import java.util.List;

public class lecture1NityaBhaiya {

    public static int cnt=0;
    public static void main(String[] args) {
//         DEC(6); //6 5 4 3 2 1
        // Inc(6); //1 2 3 4 5 6

        //System.out.println(Fibo(5));
        int arr[]={2,3,6,7};
        int tar=7;
//        Type1(tar,arr,0,""); // p with Rep
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> ans = new ArrayList<>();
//        Type2r(tar,arr,0,ans,0 , list);// c with rep
        Type2(tar,arr,0,"",0);

//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));
//        }

//        Type3(tar,arr,0,"",0);    // c without rep
//        int vis[]= new int[arr.length];
//        Type4(tar,arr,0,"",vis);       // p without rep
//        System.out.println(cnt+" Total num of count");
    }
    public static void Type4(int tar,int arr[],int sum,String ans,int vis[]){
        if(sum==tar){
            System.out.println(ans);
            cnt++;
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(vis[i]==0&&sum+arr[i]<=tar){
                vis[i]=1;
                Type4(tar,arr,sum+arr[i],ans+arr[i],vis);
                vis[i]=0;
            }
        }
    }


    public static void Type3(int tar,int arr[],int sum,String ans,int id){
        if(sum==tar){
            System.out.println(ans);
            cnt++;
            return;
        }

        for(int i=id;i<arr.length;i++){
            if(sum+arr[i]<=tar){
                Type3(tar,arr,sum+arr[i], ans+arr[i],i+1);
            }
        }
    }


    //Type2(tar,arr,0,"",0);    // c with rep
    public static void Type2(int tar,int arr[],int sum,String ans,int id){
        if(sum==tar){
            System.out.println(ans);
            cnt++;
            return;
        }

        for(int i=id;i<arr.length;i++){
            if(sum+arr[i]<=tar){
                Type2(tar,arr,sum+arr[i], ans+arr[i],i);
            }
        }
    }
    public static  void Type2r (int tar,int arr[],int sum,List ans,int id ,List list2){
        if(sum==tar){

            list2.add(ans);
            return ;
        }

        for(int i=id;i<arr.length;i++){
            if(sum+arr[i]<=tar){
                ans.add(arr[i]);
                 Type2r(tar,arr,sum+arr[i], ans,i ,list2);
                 ans.remove(ans.size());
            }
        }


    }



    //Type1(tar,arr,0,"");
    public static void Type1(int tar,int arr[],int sum,String ans){

        if(sum==tar){
            System.out.println(ans);
            cnt++;
            return;
        }

        for(int i=0;i<arr.length;i++){
               if(sum+arr[i]<=tar){
                Type1(tar,arr,sum+arr[i], ans+arr[i]);
            }
        }
    }






    public static int Fibo(int n){
        if(n==0||n==1){
            return 1;
        }
        int a= Fibo(n-1);
        int b= Fibo(n-2);
        return a+b;

    }


    public static void Inc(int n){
        if(n==0){
            return;
        }
        Inc(n-1);
        System.out.print(n+" ");
    }
    public static void DEC(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        DEC(n-1);
    }
}
