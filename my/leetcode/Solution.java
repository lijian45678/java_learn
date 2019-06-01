package my.leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    //正则匹配
//    public boolean isMatch(String s, String p) {
//        if (s == null || s =="" || p == null  || s =="") return  false;
//
//    }
    //字符串数字
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 ==null) return null;
        while (t1.left!=null){
        }
        return t1;

    }
    public int TreeDepth(TreeNode root) {
        if(root == null ) return 0;
        int le = TreeDepth(root.left);
        int ri = TreeDepth(root.right);
        return le>ri?le:ri;


    }
//
//    public boolean isNumeric(char[] str) {
//        if(str == null) return false;
//        boolean f = false;
//        for(int i =0 ;i< str.length ;i++ ){
//            if (i == 0) {
//              if(str[i]=='+'||str[i]=='-'||(str[i]>'0'&&str[i]<'9')){
//                  f = true;
//                  continue;
//              }else {
//                  return false;
//              }
//            }
//            if(i==1){
//            if(!(str[i]>'0'&&str[i]<'9')&&f == true){
//                return false;
//                continue;
//            }
//            }
//            if((str[i]>'0'&&str[i]<'9'))
//
//        }
//
//
//
//    }

    public int Add(int num1,int num2) {
        IntStream intStream ;
        BigInteger bi1=new BigInteger(String.valueOf(num1));
        BigInteger bi2=new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();


    }



    public int myAtoi(String str) {
        if (str== null || str == "") return 0;
        char [] chars = str.toCharArray();
        for(int i =0 ;i<chars.length;i++){
            if(chars[i]>='0'&&chars[i]<='9'){
                int k = i ;
                StringBuilder stringBuilder =new StringBuilder();
                stringBuilder.append(chars[i]);
                for( i++;i<k+10&&i<chars.length;i++){
                    if(chars[i]>='0'&&chars[i]<='9'){
                        stringBuilder.append(chars[i]);
                    }else break;
                }
                if (stringBuilder.length()==10&&stringBuilder.toString().compareTo("2147483647")>=0){
                    return 2147483647;
                }else {
                    return Integer.valueOf(stringBuilder.toString());
                }
            }else if(chars[i]=='+'){
                int k = i ;
                StringBuilder stringBuilder =new StringBuilder();
                for( i++;i<k+11&&i<chars.length;i++){
                    if(chars[i]>='0'&&chars[i]<='9'){
                        stringBuilder.append(chars[i]);
                    }else break;
                }
                if (stringBuilder.length() ==0){
                    return 0;
                }
                if (stringBuilder.length()==10&&stringBuilder.toString().compareTo("2147483647")>=0){
                    return Integer.MAX_VALUE;
                }else {
                    return Integer.valueOf(stringBuilder.toString());
                }

            }else if (chars[i]=='-'){
                int k = i ;
                StringBuilder stringBuilder =new StringBuilder();
                for( i++;i<k+11&&i<chars.length;i++){
                    if(chars[i]>='0'&&chars[i]<='9'){
                        stringBuilder.append(chars[i]);
                    }else break;
                }
                System.out.println(stringBuilder.toString()+".....");
                if (stringBuilder.length() ==0){
                    return 0;
                }
                if (stringBuilder.length()==10&&stringBuilder.toString().compareTo("2147483648")>=0){
                    return Integer.MIN_VALUE;
                }else {
                    return -Integer.valueOf(stringBuilder.toString());
                }
            }
        }
        return 0;
    }



    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
        Solution solution =new Solution();
        System.out.println(solution.myAtoi("words and 987"));
    }
}
