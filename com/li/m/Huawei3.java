package com.li.m;

import java.util.*;

public class Huawei3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            char [] c = s.toCharArray();
            System.out.println(s);
            Map<Integer,Integer> list = new HashMap<>();
            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2= new Stack<>();
            Stack<Integer> stack3 = new Stack<>();
            StringBuilder stringBuilder = new StringBuilder();
            int k;
            for(int i=0 ;i<c.length ; i++){
                if (c[i] == '(') {
                    stack1.push(i);
                }else if(c[i] == '['){
                    stack2.push(i);
                }else if(c[i] == '{'){
                    stack3.push(i);
                }
                if (c[i] == ')') {
                    k=stack1.pop();
                }else if(c[i] == '['){
                    k=stack2.pop();
                }else if(c[i] == '['){
                    k=  stack1.pop();
                }

                }
                }
            }
        }






