# https://leetcode.com/problems/implement-strstr/

# MY SOLUTION

class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if(len(needle)==0):
            return 0
        if(needle not in haystack):
            return -1
        else:
            for i in range(len(haystack)):
                for j in range(len(haystack)+1):
                    if(haystack[i:j]==needle):
                        return i
            
# OTHER BEST APPROACHES - KMP ALGORITHM OR RABIN KARP ALGORITHM

'''
class Solution(object):
def strStr(self, haystack, needle):
    """
    :type haystack: str
    :type needle: str
    :rtype: int
    """
    for i in range(len(haystack) - len(needle)+1):
        if haystack[i:i+len(needle)] == needle:
            return i
    return -1
'''    
