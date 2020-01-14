# https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        s = 0
        count = -1
        temp = head
        while(temp!=None):
            count+=1
            temp = temp.next
        temp = head
        #print(count)
        while(temp!=None):
            s = s+(temp.val*(2**count))
            count = count - 1
            temp = temp.next
        return s
        
        
# APPROACH 1 

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        ans = 0
        while head: 
            ans = 2*ans + head.val 
            head = head.next 
        return ans 
        
# APPROACH 2

def getDecimalValue(self, head: ListNode) -> int:
        ans = 0
        while head:
            ans = (ans << 1) | head.val
            head = head.next
        return ans
