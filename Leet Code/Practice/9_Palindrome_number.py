# https://leetcode.com/problems/palindrome-numbe

# MY SOLUTION

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if(x<0):
            f=-1
            x = (-1)*x
        else:
            f=1
        y = x
        rev = 0
        while(x!=0):
            r = x%10
            x = x//10
            rev = rev*10 + r
        #print(rev)
        if(y == (f*rev)):
            return True
        else:
            return False
        
        
# BEST APPROACH

#https://leetcode.com/problems/palindrome-number/solution/

    if(x<0 or (x%10==0 and x!=0)):
                return False
            rev = 0
            while(x>rev):
                rev = rev*10+(x%10)
                x=x//10
            return x==rev or x==(rev//10)
