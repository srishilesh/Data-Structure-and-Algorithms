# https://leetcode.com/problems/linked-list-cycle/
# FLOYD TORTOISE AND HARE APPROACH



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        
        try:
            slow = head
            fast = head.next
            while(slow is not fast):
                slow = slow.next
                fast = fast.next.next
            return True
        except:
            return False
        
        # if(head == None or head.next==None):
        #     return False
        # temp = head
        # temp1 = head
        # while(temp!=None):
        #     temp1 = temp.next
        #     while(temp1!=None):
        #         if(temp.next==temp1.next):
        #             return True
        #         temp1 = temp1.next
        #     temp = temp.next
        # return False
                

# https://leetcode.com/problems/linked-list-cycle/solution/
