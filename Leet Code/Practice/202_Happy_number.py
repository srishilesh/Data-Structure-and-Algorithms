# https://leetcode.com/problems/happy-number

# MY SOLUTION

class Solution:
    def isHappy(self, n: int) -> bool:
        s = n
        x = set()
        while((s**2)>=10):
            c = 0
            temp = list(str(s))
            for i in temp:
                c = c+ int(i)**2
            s = c
            if(s not in x):
                x.add(s)
            else:
                return False
            #print(s)
        if(s==1):
            return True
        else:
            return False
        
        
