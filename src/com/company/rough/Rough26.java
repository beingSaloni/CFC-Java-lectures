package com.company.rough;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Rough26 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while(t-- >0){
            int n = fr.nextInt();
            int k = fr.nextInt();

            StringBuilder sb = new StringBuilder(fr.next());
            int maxc = 0;
            int c = 0;

            for (int i = 0; i < n; i++) {
                if(c > maxc){
                    maxc = c;
                }
                if(maxc==k){
                    break;
                }
               if(sb.charAt(i)=='*'){
                   c++;
               }else {
                   c=0;
               }
            }
            if (maxc<k){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}