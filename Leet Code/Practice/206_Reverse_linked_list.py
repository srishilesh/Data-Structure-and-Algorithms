# https://leetcode.com/problems/reverse-linked-list

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        temp = head
        stack = []
        while(temp!=None):
            stack.append(temp.val)
            temp = temp.next
        temp1 = head
        while(temp1!=None):
            temp1.val = stack.pop(len(stack)-1)
            temp1 = temp1.next
        return head
        
        
# https://leetcode.com/problems/reverse-linked-list/solution/        
