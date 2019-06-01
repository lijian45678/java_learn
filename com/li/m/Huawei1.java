package com.li.m;
import java.util.*;


/**
 * 2 abc 123456789
 * @author DELL
 *
 */
public class Huawei1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            String[] strs = new String[n];
            for(int i = 0; i < n; i++) {
                strs[i] = sc.next();
            }
            List<String> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                int len = strs[i].length();
                int num = len / 8;
                int mod = len % 8;
                for(int j = 0; j < num; j++) {
                    list.add(strs[i].substring(8 * j, 8 * j + 8));
                }
                StringBuilder sb = new StringBuilder(strs[i].substring(8 * num));
                for(int j = 0; j < (8 - mod); j++) {
                    sb.append("0");
                }
                list.add(sb.toString());
            }
            Collections.sort(list);
            System.out.println(list);
        }
    }
}
