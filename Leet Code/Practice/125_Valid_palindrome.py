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

class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s=="":
            return True
        s = s.lower()
        head = 0
        tail = len(s) - 1
        while(head<=tail):
            chead = s[head]
            ctail = s[tail]
            if(chead.isalnum()==False):
                head += 1
            elif(ctail.isalnum()==False):
                tail -= 1
            else:
                if(chead!=ctail):
                    return False
                head += 1
                tail -= 1
        return True        
# https://leetcode.com/problems/valid-palindrome/discuss/40029/Accepted-pretty-Java-solution(271ms)            
