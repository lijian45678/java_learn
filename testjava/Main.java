package testjava;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        System.out.println(Long.divideUnsigned(Long.MAX_VALUE,10000l));

//        String c = Deal(a);
//        System.out.println(c);
    }
    public static  String Deal(long a){
        String c= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = new char[4];
        for(int i=0 ;i<4;i++) chars[i]='0';
        int i=3;
        while (a>0 && i>=0){
            System.out.println(a%36);
                chars[i--] = c.charAt((int)a%36);
            a/=36;
        }
        return new String(chars);
    }

}
