# https://leetcode.com/problems/valid-palindrome/

class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s=="":
            return True
        s = s.lower()
        # s = list(s)
        c = 0
        x = []
        for i in range(len(s)):
            if(s[i].isalnum()==True):
                x.append(s[i])
        i = 0
        while(i<len(x)):
            if(x[i] == x[len(x)-i-1]):
                c+=1
            i+=1
        if(c==(len(x))):
            return True
        else:
            return False
            
# https://leetcode.com/problems/valid-palindrome/discuss/40029/Accepted-pretty-Java-solution(271ms)            
