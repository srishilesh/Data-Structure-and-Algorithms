# https://leetcode.com/problems/merge-two-sorted-lists/

# MY SOLUTION

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        #l3 = ListNode()
#         x = []
#         y = []
#         temp1 = l1
#         temp2 = l2
#         while(temp1 is not None):
#             x.append(temp1.val)
#             temp1 =temp1.next
#         while(temp2 is not None):
#             y.append(temp2.val)
#             temp2 = temp2.next
        
#         z = []
#         for i in range(len(x)):
#             z.append(x[i])
#             z.append(y[i])
#         z.sort(reverse=True)  
#         #if(z!=[]):
#         l3 = ListNode(None)
#         #l3 = ListNode(0)
#         tempo = l3
#         for i in range(0,len(z)):
#             temp = ListNode(z[i])
#             temp.next = l3
#             l3 = temp
    
        
#         while((tempo.next) is not None):
            
#             tempo = tempo.next
#         print(tempo)
        dummy = cur = ListNode(0)
        while l1 and l2:
            if(l1.val<l2.val):
                cur.next = l1
                l1 = l1.next
            else:
                cur.next = l2
                l2 = l2.next
            cur = cur.next
        cur.next = l1 or l2
        return dummy.next
        
        
# OTHER APPROACHES

# iteratively
def mergeTwoLists1(self, l1, l2):
    dummy = cur = ListNode(0)
    while l1 and l2:
        if l1.val < l2.val:
            cur.next = l1
            l1 = l1.next
        else:
            cur.next = l2
            l2 = l2.next
        cur = cur.next
    cur.next = l1 or l2
    return dummy.next
    
# recursively    
def mergeTwoLists2(self, l1, l2):
    if not l1 or not l2:
        return l1 or l2
    if l1.val < l2.val:
        l1.next = self.mergeTwoLists(l1.next, l2)
        return l1
    else:
        l2.next = self.mergeTwoLists(l1, l2.next)
        return l2
        
# in-place, iteratively        
def mergeTwoLists(self, l1, l2):
    if None in (l1, l2):
        return l1 or l2
    dummy = cur = ListNode(0)
    dummy.next = l1
    while l1 and l2:
        if l1.val < l2.val:
            l1 = l1.next
        else:
            nxt = cur.next
            cur.next = l2
            tmp = l2.next
            l2.next = nxt
            l2 = tmp
        cur = cur.next
    cur.next = l1 or l2
    return dummy.next
