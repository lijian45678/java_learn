package my.leetcode;
import java.util.*;
import java.util.stream.IntStream;

public class solutionBiSai {
    public int repeatedNTimes(int[] A) {

        Map<Integer ,Integer > map = new HashMap<>();
        for(int a : A){
            map.put(a,map.get(a)==null?1:map.get(a)+1);
        }
        int k = 0;
        int res =0 ;
        Iterator entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();
            if (value>k) {
                k = value ;
                res = key ;
            }

           // System.out.println("Key = " + key + ", Value = " + value);
        }
        return res;
    }
    public int maxWidthRamp(int[] A) {
        int max = 0;
        for(int i =0 ; i < A.length; i++){
            for(int j=i+1; j <A.length ;j++){
                if(A[j]-A[i]>max) max = A[j]-A[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {

        int [] A = new int[]{1,2,3,3};
       // solutionBiSai solutionBiSai = new solutionBiSai();
       // System.out.println(solutionBiSai.repeatedNTimes(A));
        IntStream stream = Arrays.stream(A);
        stream.forEach(x-> System.out.println(x));
        OptionalInt max = stream.max();
        System.out.println(max.getAsInt());


    }
}
