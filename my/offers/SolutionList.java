package my.offers;

import java.util.HashMap;

public class SolutionList {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         if (pHead1 == null && pHead2 == null) return null;
         ListNode l1,l2;
         l1=pHead1;l2=pHead2;
         while (l1 != null ){
             while (l2!=null){
                if(l2==l1) return l1;
                else l2=l2.next;
             }
             l2=pHead2;
             l1=pHead1.next;
             pHead1=pHead1.next;
         }

         return null;

    }

    public static void main(String[] args) {
        String i="a1114av";
        System.out.println((i.hashCode()));
        System.out.println((i.hashCode()>>>16));

        System.out.println((i.hashCode()>>>16^i.hashCode()));
        System.out.println(false||false||true&&true);
    }
}
