// *
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; }
//  * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String s1="",s2="",sr1="",sr2="";
       while(l1!=null)
       {
           s1 = s1 + l1.val;
           l1 = l1.next;
       }
        while(l2!=null)
       {
           s2 = s2 + l2.val;
           l2 = l2.next;
       }
        for(int i=s1.length()-1;i>=0;i--)
        {
            sr1 = sr1 + s1.charAt(i);
            
        }
        for(int i=s2.length()-1;i>=0;i--)
            sr2 = sr2 + s2.charAt(i);
        int one = Integer.parseInt(sr1);
        int two = Integer.parseInt(sr2);
        int three = one + two;
        // System.out.println(one);
        // System.out.println(two);
        // System.out.println(three);
        String sr3 = three+"";
        ListNode l3 = new ListNode(Integer.parseInt(sr3.charAt(sr3.length()-1)+""));
        ListNode r4 = l3;
        //System.out.print(l3.val+ " -> ");
        for(int i=sr3.length()-2;i>=0;i--)
        {
            ListNode cur = new ListNode(Integer.parseInt(sr3.charAt(i)+""));
               // System.out.println(cur.val+"*");
           // if(l3!=null)
            {
            
            l3.next = cur;
                //l3.val = cur.val;
                l3 = l3.next;    
            }
                
                System.out.print(l3.val+" -> ");
                

        }
        
        return r4;
       
    }
   
}



/*
SOLUTION

// *
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; }
//  * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode p=l1;ListNode q = l2,cur = dummy;
        // int x,y,sum;
        while(p!=null || q!=null)
        {
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;
            int sum = x + y + carry;
            carry = sum/10;
            ListNode newnode = new ListNode(sum%10);
            cur.next = newnode;
            cur = cur.next;
            if(p!=null)p = p.next;
            if(q!=null)q = q.next;
            
            
            
        }
       
        if(carry>0)
            cur.next = new ListNode(carry);
        return dummy.next;
    }

*/
