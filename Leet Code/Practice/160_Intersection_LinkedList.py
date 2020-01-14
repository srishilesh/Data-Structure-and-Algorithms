# https://leetcode.com/problems/intersection-of-two-linked-lists/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        tempA = headA
        tempB = headB
        lenA = 0
        lenB = 0
        while(tempA!=None):
            lenA+=1
            tempA = tempA.next
        while(tempB!=None):
            lenB+=1
            tempB = tempB.next
        tempA = headA
        tempB = headB
        if(lenA>lenB):
            for i in range(lenA-lenB):
                tempA = tempA.next
        if(lenB>lenA):
            for i in range(lenB-lenA):
                tempB = tempB.next
        while(tempA!=tempB):
            tempA = tempA.next
            tempB = tempB.next
        return tempA
        
        
        
# TIME LIMIT EXCEEDED
        # if(headA == None or headB == None):
        #     return None
        # if(headA==headB):
        #     return headA
        # temp1 = headA
        # temp2 = headB
        # while(temp1!=None):
        #     temp2 = headB
        #     while(temp2!=None):
        #         if(temp1 == temp2):
        #             return temp1
        #         if(temp1.next == temp2.next):
        #             return temp1.next
        #         temp2 = temp2.next
        #     temp1 = temp1.next
        # return None
        
        
        
# MODIFIED THE STRUCTURE
        # stackA = []
        # stackB = []
        # tempA = headA
        # tempB = headB
        # while(tempA!=None):
        #     stackA.append(tempA.val)
        #     tempA = tempA.next
        # tempA = headA
        # while(tempA!=None):
        #     tempA.val = stackA.pop(len(stackA)-1)
        #     tempA = tempA.next
        # while(tempB!=None):
        #     stackB.append(tempB.val)
        #     tempB = tempB.next
        # tempB = headB
        # while(tempB!=None):
        #     tempB.val = stackB.pop(len(stackB)-1)
        #     tempB = tempB.next
        # temp = headA
        # try:
        #     while(temp!=None):
        #         temp = temp.next
        #     return None
        # except:
        #     return temp
        
        
        
# ERROR
        #         temp = headA
        #         li = []
        #         while(temp!=None):
        #             li.append(temp.val)
        #             temp = temp.next
        #         temp1 = headB
        #         while(temp1!=None):
        #             if(temp1.val in li):
        #                 return temp1
        #             temp1 = temp1.next

        #         return None




# BEST SOLUTION

class Solution:
    # @param two ListNodes
    # @return the intersected ListNode
    def getIntersectionNode(self, headA, headB):
        if headA is None or headB is None:
            return None

        pa = headA # 2 pointers
        pb = headB

        while pa is not pb:
            # if either pointer hits the end, switch head and continue the second traversal, 
            # if not hit the end, just move on to next
            pa = headB if pa is None else pa.next
            pb = headA if pb is None else pb.next

        return pa # only 2 ways to get out of the loop, they meet or the both hit the end=None

# the idea is if you switch head, the possible difference between length would be countered. 
# On the second traversal, they either hit or miss. 
# if they meet, pa or pb would be the node we are looking for, 
# if they didn't meet, they will hit the end at the same iteration, pa == pb == None, return either one of them is the same,None
