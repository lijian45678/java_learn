package com.li.m;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class alibaba1 {




/** 请完成下面这个函数，实现题目要求的功能 **/
        /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
        static String calculate(int m, int k) {
            int year = 2019;
            for(int i=1 ;i<m;i++){
                if(f(i)<=m &&f(i-1)>=m){
                    year=year+i;
                }

            }


            return  "a";



        }
        static int f(int n){
            if(n==1){
                return 2;
            }
            if(n==2){
                return 3;
            }
            return f(n-2)+f(n-3);
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String[] line = in.nextLine().split(",");
            int m = Integer.valueOf(line[0]);
            int k = Integer.valueOf(line[1]);;
            System.out.println(calculate(m, k));

        }
}

