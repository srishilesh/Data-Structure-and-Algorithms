# https://leetcode.com/problems/middle-of-the-linked-list

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        temp = head
        temp1 = head
        if(temp.next == None):
            return temp
        c = 1
        while(temp!=None):
            c+=1
            temp = temp.next
            
        
        if(c%2==0):
            key = c//2
        else:
            key = c//2 + 1
            
        c = 1
        while(temp1!=None):
            if(c == key):
                return temp1
            c+=1
            temp1 = temp1.next
            
            
        
  # SOLUTION : https://leetcode.com/problems/middle-of-the-linked-list/solution/
