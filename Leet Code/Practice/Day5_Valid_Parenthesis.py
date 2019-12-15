# https://leetcode.com/problems/valid-parentheses

class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        s = list(s)
        if(len(s)==0):
            return True
        if(len(s)==1 or (s[0]==')') or (s[0]==']') or (s[0]=='}')):
            return False
        
        for i in range(len(s)):
            if ((s[i]=='(') or (s[i]=='[') or (s[i]=='{')):
                stack.append(s[i])
                
            else:
                if((len(stack)-1)>0):
                    top = stack[len(stack)-1]
                else:
                    break
                if((top=='('and s[i]==')') or (top=='['and s[i]==']') or (top=='{'and s[i]=='}')):
                    stack.pop(len(stack)-1)
                else:
                    return False
        
        if(len(stack)==0):
            return True
        else:
            return False
