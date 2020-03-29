// https://leetcode.com/problems/find-lucky-integer-in-an-array/

// MY APPROACH

class Solution:
    def findLucky(self, arr: List[int]) -> int:
        unique = list(set(arr))
        diction = {}
        for i in arr:
            if i not in diction:
                diction[i] = 1
            else:
                diction[i]+=1
        lucky = []
        for i in diction:
            if diction[i] == i:
                lucky.append(i)
        if lucky!=[]:    
            return max(lucky)
        else:
            return -1
        
        
