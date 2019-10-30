// *
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; }
//  * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = l1;
        String s1="",s2="",sr1="",sr2="";
       while(l1.next!=null && l2.next!=null)
       {
           s1 = s1 + l1.val;
           s2 = s2 + l2.val;
           l1 = l1.next;
           l2 = l2.next;
           
       }
        for(int i=s1.length()-1;i>=0;i--)
        {
            sr1 = sr1 + s1.charAt(i);
            sr2 = sr2 + s2.charAt(i);
        }
        int one = Integer.parseInt(sr1);
        int two = Integer.parseInt(sr2);
        int three = one + two;
        String sr3 = three+"";
        for(int i=sr3.length()-1;i>=0;i--)
        {
            if(l3.next!=null)
            {
                l3.val = sr3.charAt(i);
                l3 = l3.next;
            }
        }
        return l3;
       
    }
}
