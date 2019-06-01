package com.li.m;

public class Solution {

    public static void main(String[] args) {
       String  s  = "we   ikle you";
        System.out.println(s.replaceAll(" ","%20"));
        int a[][] = new int[][]{{1,2,3},
                {3,5,6},
                {4 ,8  ,9}};
        System.out.println(IsExistence(a,1));
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i01==i02);
        System.out.println(i03==i01);
        System.out.println(i04==i03);
        System.out.println(i04==i02);



    }
    public  static  boolean IsExistence(int[][] a, int e){
        int n = a.length;
        int m = a[0].length;
        if(n==0||m==0) return false;
        if(e<a[0][0]||e>a[n-1][m-1]) return false;
        int i =n-1,j=0;
        while (i>=0&&j<=n-1){
            if(a[i][j]>e){
                i--;
            }else if(a[i][j]<e){
                j++;
            }else {
                return true;
            }
        }
        return false;
    }

}
