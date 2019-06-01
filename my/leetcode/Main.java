package my.leetcode;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] array = new int[6];
        array[0] = Integer.parseInt(str[0].substring(1));
        array[5] = Integer.parseInt(str[5].substring(0,str[5].toCharArray().length-1));
        for (int i = 1; i < 5; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        System.out.println(getMaxTime(array));
    }

    public static String getMaxTime(int[] ints) {
        List<Integer> list = new ArrayList<>(ints.length);
        for (int i : ints) {
            list.add(i);
        }
        String result = "";
        String error = "invalid";
        //shi
        String temp = getMaxHourOrSecond(list, 2, 3);
        if ("".equals(temp)) {
            return error;
        } else {
            result += temp;
            result += ":";
        }
        temp = getMaxHourOrSecond(list, 5, 9);
        if ("".equals(temp)) {
            return error;
        } else {
            result += temp;
            result += ":";
        }
        temp = getMaxHourOrSecond(list, 5, 9);
        if ("".equals(temp)) {
            return error;
        } else {
            result += temp;
        }
        return result;
    }


    public static String getMaxHourOrSecond(List<Integer> list, int shi, int ge) {

        int i1 = 0;int i2 = 0;int i3=0;

        boolean isExist1 = false;int index1 = 0;int deleteTarget1 = 0;
        for (Integer integer : list) {
            if (integer <= shi) {
                if (i1 <= integer) {
                    i1 = integer;
                    isExist1 = true;
                    deleteTarget1 = index1;
                }
            }
            index1++;
        }
       boolean isExist2 = false; int index2 = 0;int deleteTarget2 = 0;
        for (Integer integer : list) {
            if(index2==deleteTarget1) {
                index2++;
                continue;
            }
            if (integer <= ge) {
                if (i2 <= integer) {
                    i2 = integer;
                    isExist2 = true;
                    deleteTarget2 = index2;
                }
            }
            index2++;
        }
        boolean isExist = false; int index = 0;int deleteTarget = 0;
        for (Integer integer : list) {
            if (integer <= (shi*10+ge)&&integer>9) {
                if (i3 <= integer) {
                    i3 = integer;
                    isExist = true;
                    deleteTarget = index;
                }
            }
            index++;
        }
        if(!isExist&&!(isExist1&&isExist2)){
            return "";
        }else if(isExist&&isExist1&&isExist2){
            if(i1*10+i2>=i3){
                if(deleteTarget1>deleteTarget2){
                    list.remove(deleteTarget1);
                    list.remove(deleteTarget2);
                }else {
                    list.remove(deleteTarget2);
                    list.remove(deleteTarget1);
                }
                return "" + i1 + i2;
            }else {
                list.remove(deleteTarget);
                return ""+i3;
            }
        }
        if(isExist){
            list.remove(deleteTarget);
            return ""+i3;
        }

        if(isExist1&&isExist2){
            if(deleteTarget1>deleteTarget2){
                list.remove(deleteTarget1);
                list.remove(deleteTarget2);
            }else {
                list.remove(deleteTarget2);
                list.remove(deleteTarget1);
            }
            return "" + i1 + i2;
        }
        return "";

    }
}