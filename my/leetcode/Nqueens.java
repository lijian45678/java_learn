package my.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    public static int[][] arry=new int[8][8];//棋盘，放皇后
    public static int map=0;//存储方案结果数量
    public static List<int[][]> list = new ArrayList<>();

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("八皇后问题");
        findQueen(0);
        print();
        System.out.println("八皇后问题共有："+map+"种可能");
    }

    public static void findQueen(int i){//寻找皇后节点
        if(i>7){//八皇后的解
            map++;
            int[][] clone = new int[8][8];
            for(int w = 0;w < arry.length;w++){
                for(int j = 0;j < arry[w].length;j++){
                    clone[w][j] = arry[w][j];
                }
            }
            list.add(clone);
         //   print();//打印八皇后的解
            return;
        }

        for(int m=0;m<8;m++){//深度回溯,递归算法
            if(check(i,m)){//检查皇后摆放是否合适
                arry[i][m]=1;
                findQueen(i+1);
                arry[i][m]=0;//清零，以免回溯的时候出现脏数据
            }
        }
    }

    public static boolean check(int k,int j){//判断节点是否合适
        for(int i=0;i<8;i++){//检查行列冲突
            if(arry[i][j]==1){
                return false;
            }
        }
        for(int i=k-1,m=j-1; i>=0 && m>=0; i--,m--){//检查左对角线
            if(arry[i][m]==1){
                return false;
            }
        }
        for(int i=k-1,m=j+1; i>=0 && m<=7; i--,m++){//检查右对角线
            if(arry[i][m]==1){
                return false;
            }
        }
        return true;
    }

    public static void print(){//打印结果
       // System.out.print("方案"+map+":"+"\n");
        int n=1;
        for(int[][] a : list){
        for(int i=0;i<8;i++){
            for(int m=0;m<8;m++){
                if(a[i][m]==1){
                    //System.out.print("皇后"+(i+1)+"在第"+i+"行，第"+m+"列\t");
                    System.out.print("Q");
                }
                else{
                    System.out.print(".");
                }
            }
            if (i!=7) System.out.print(",");
            if (i==7) System.out.print("]");
            if(n<map&&i==7) {
                System.out.print(",");
                n++;}
            System.out.println();
        }
        System.out.println();
    }
    }
}
